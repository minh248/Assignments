import React, {Fragment} from 'react'

function TableHeader(props) {
    return (
        <Fragment>
            <tr>
                <th>Họ tên</th>
                <th>Ngày sinh</th>
                <th>Giới tính</th>
            </tr>
        </Fragment>
    )
}

export default TableHeader