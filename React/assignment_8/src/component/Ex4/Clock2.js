import React from 'react'
import useClock from "./useClock";
import style from './stylesheet.module.css'

const Clock2 = () => {
    const [time, ampm] = useClock()

    return (
        <div className={style.clock2}>
            <span>{time}</span>
            <span>{ampm}</span>
        </div>
    )
}

export default Clock2