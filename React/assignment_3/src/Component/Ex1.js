import React from 'react'
import './css/Ex1.css'

let hello = () => {
    console.log("Hello")
}



class Ex1 extends React.Component{
    render() {
        return (
            <React.Fragment>
                <h1 onClick={hello}>Hello world</h1>
                <p>My first paragraph</p>
                <br/>

                <h2>Danh sách lớp học</h2>
                <ol>
                    <li>Nguyễn Ngọc Duy</li>
                    <li>Tống Quang Anh</li>
                    <li>Đinh Thu Loan</li>
                    <li>Hà Văn Tiến</li>
                    <li>Nguyễn Hải Đăng</li>
                    <li>Nguyễn Tiến Quang</li>
                    <li>Nguyễn Văn Chiến</li>
                </ol>
                <ol>
                    <li>
                        Cơm trưa
                        <ul>
                            <li>Cơm chiên hải sản</li>
                            <li>Cơm sườn non nấu cam</li>
                            <li>Cơm canh chua các lóc</li>
                        </ul>
                    </li>
                    <li>
                        Tráng miệng trái cây
                        <ul>
                            <li>Nho tươi</li>
                            <li>Chuối</li>
                            <li>Mận</li>
                        </ul>
                    </li>
                </ol>
                <br/>

                <div>
                    <div className={"b1"}>Hello world</div>
                    <div className={"b2"}>Hello world</div>
                    <div className={"b3"}>Hello world</div>
                </div>
                <br/>


            </React.Fragment>
        )
    }
}

export default Ex1