import React, {useState, useEffect} from 'react'
import axios from "axios";
import WithLoading from "./WithLoading";

class UserContainer extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            users : []
        }
    }

    getUserList = async () => {
        const baseUrl = `https://5fbfb63cfd14be0016748f86.mockapi.io`
        try {
            const response = await axios.get(`${baseUrl}/api/v1/users`)
            this.setState({
                users: response.data
            })
        } catch (e) {
            console.log(e)
        }
    }

    componentDidMount() {
        this.getUserList()
    }

    componentDidUpdate(prevProps, prevState, snapshot) {
        this.getUserList()
    }

    render() {
        const UserContainerWithLoading = WithLoading(UserList)

        return (
            <>

            </>
        )
    }
}


export default UserContainer