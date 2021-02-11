import Api from './Api'

const url = "/employees"

const getAll = () => {
    return Api.get(url)
}

const EmployeeApi = {getAll}
export default EmployeeApi

