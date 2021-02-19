import React from 'react'
import useClock from "./useClock";
import style from './stylesheet.module.css'

const Clock1 = () => {
    const [time, ampm] = useClock()

    return (
        <div className={style.clock1}>
            <span>{time}</span>
            <span>{ampm}</span>
        </div>
    )
}

export default Clock1