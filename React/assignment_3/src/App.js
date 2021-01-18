import './App.css'

function hello() {
    console.log("hello");
}

function App() {
    return (
        <div>
            <h1 onClick={hello}>Hello world</h1>
            <p>My first react app</p>

            <h2>Danh sách lớp</h2>
            <ol>
                <li>Nguyễn Ngọc Duy</li>
                <li>Tống Quang Anh</li>
                <li>Đinh Thu Loan</li>
                <li>Hà Văn Tiến</li>
                <li>Nguyễn Hải Đăng</li>
                <li>Nguyễn Tiến Quang</li>
                <li>Nguyễn Văn Chiến</li>
            </ol>

            <div className="yellowBorder"> Hello World</div><br/>
            <div className="blueBorder"> Hello World</div><br/>
            <div className="purpleBorder"> Hello World</div><br/>


        </div>
    )
}

export default App;


