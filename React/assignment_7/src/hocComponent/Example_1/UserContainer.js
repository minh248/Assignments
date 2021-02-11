import React from 'react'
import UserApi from "../api/UserApi";
import UserList from "./UserList";
import WithLoading from "../hoc/loading/WithLoading";

class UserContainer extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            users: []
        }
    }

    getUserList = async () => {
        try {
            const users = await UserApi.getAll()
            this.setState({
                users: users
            })
        } catch (e) {
            console.log(e)
        }
    }

    componentDidMount() {
        this.getUserList()
    }

    render() {
        const UserListWithLoading = WithLoading(UserList)
        // UserListWithLoading.displayName = `xxxxxx`

        return (
            <>
                {/*<button onClick={this.getUserList}>Show users</button>*/}
                <UserListWithLoading isLoading={this.state.users.length === 0} users={this.state.users}/>
            </>
        )
    }
}

export default UserContainer