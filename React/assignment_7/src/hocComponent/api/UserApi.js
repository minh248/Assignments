import Api from './Api'

const url = '/users'

const getAll = () => {
    return Api.get(url)
}

const UserApi = {getAll}
export default UserApi