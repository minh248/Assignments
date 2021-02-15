import React from 'react'
import {useState, useEffect} from 'react'
import UserContainer from "./UserContainer";


const Cleanup = () => {
    const [isShow, setShow] = useState(true)

    const toggle = () => {
        setShow(!isShow)
    }

    return (
        <div>
            <button onClick={toggle}> Show/Hide Component</button>
            {isShow && <UserContainer/>}
        </div>
    )
}

export default Cleanup