import React from 'react'

function EmployeeList(props) {
    const employeeList = props.employees.map(
        employee => (
            <li key={employee.id}>
                {employee.name}
            </li>
        )
    )

    return (
        <>
            {employeeList}
        </>
    )
}