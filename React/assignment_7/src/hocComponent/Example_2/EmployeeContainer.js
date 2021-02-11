import React from 'react'
import EmployeeApi from "../api/EmployeeApi";
import WithLoading from "../hoc/loading/WithLoading";
import EmployeeList from "../AxiosExample/EmployeeList";
import WithAuth from "../hoc/auth/WithAuth";

class EmployeeContainer extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            employees: []
        }
    }

    getListEmployee = async () => {
        try {
            const employees = await EmployeeApi.getAll()
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
        const EmployeeListWithLoading = WithLoading(EmployeeList)

        return (
            <>
                <EmployeeListWithLoading isLoading={this.state.employees.length === 0} employees={this.state.employees} />
            </>
        );
    }
}

export default WithAuth(EmployeeContainer)