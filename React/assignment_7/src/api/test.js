import Api from './Api'
import React from 'react'

class EmployeeList extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            employees: []
        }
    }

    getListEmployee = () => {
        const url = `/api/v1/employees`

        Api.get(url)
            .then(res => {
                this.setState({
                    employees: res.data
                })
            })
    }

    componentDidMount() {
        this.getListEmployee()
    }

    render() {
        const personList = this.state.employees.map(employee => {
            return (
                <li key={employee.id}>
                    {employee.name}
                </li>
            )
        })

        return (
            <p>
                {personList}
            </p>
        )
    }
}

export default EmployeeList