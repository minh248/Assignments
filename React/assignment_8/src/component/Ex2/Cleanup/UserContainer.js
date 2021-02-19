import React, {useState, useEffect} from 'react'
import axios from "axios";
import WithLoading from "./WithLoading";
import UserList from "./UserList";

const UserContainer = (props) => {
    const [users, setUsers] = useState([])

    useEffect(() => {
        const CancelToken = axios.CancelToken
        const source = CancelToken.source()

        const getUserList = async () => {
            const baseUrl = `https://5fbfb63cfd14be0016748f86.mockapi.io`

            try {
                const response = await axios.get(`${baseUrl}/api/v1/users`, {
                    cancelToken: source.token
                })

                setUsers(response.data)
            } catch (error) {
                if(axios.isCancel(error)) {
                    console.log("Request cancel", error.message)
                } else {
                    console.log(error)
                }
            }
        }

        getUserList()

        return () => {
            source.cancel("Operation canceled by the user")
        }
    })

    const UserListWithLoading = WithLoading(UserList)

    return (
        <UserListWithLoading isLoading={users.length === 0} users={users}/>
    )
}

export default UserContainer