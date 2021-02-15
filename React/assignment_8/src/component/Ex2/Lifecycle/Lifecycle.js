import React, {useState} from 'react'
import EffectLifecycle from "./EffectLifecycle";

const Lifecycle = () => {
    const [randomNumber, setRandomNumber] = useState(Math.random())
    const [isShow, setShow] = useState(true)

    const reRender = () => {
        setRandomNumber(Math.random())
    }

    const toggle = () => {
        setShow(!isShow)
    }

    return (
        <div>
            {isShow && <EffectLifecycle number={randomNumber}/>}
            <button onClick={reRender}>Re-render</button>
            <button onClick={toggle}>Show-Hide Component</button>
        </div>
    )
}

export default Lifecycle