import React from 'react'
import EmployeeApi from "../api/EmployeeApi";

class EmployeeList extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            employees: []
        }
    }

    getListEmployee = async () => {
        const employees = await EmployeeApi.getAll()
        try {
            this.setState({
                employees: employees
            })
        } catch (e) {
            console.log(e)
        }
    }

    componentDidMount() {
        this.getListEmployee()
    }

    render() {
        const employeeList = this.state.employees.map(employee => {
            return (
                <li key={employee.id}>
                    {employee.name}
                </li>
            )
        })

        return (
            <p>
                {employeeList}
            </p>
        )
    }
}

export default EmployeeList