import React, {useState, useEffect, useContext} from 'react'

const useClock = () => {
    const [time, setTime] = useState("")
    const [ampm, setAmpm] = useState("")

    const updateTime = () => {
        let date = new Date()
        let hour = 0

        if (date.getHours() === 0) {
            hour = 0
        } else if (date.getHours() > 12) {
            hour = date.getHours() - 12
        } else {
            hour = date.getHours()
        }

        let minute = date.getMinutes() < 10
            ? "0" + date.getMinutes().toString()
            : date.getMinutes().toString()

        let second = date.getSeconds() < 10
            ? "0" + date.getSeconds().toString()
            : date.getSeconds().toString()

        let ampm = date.getHours() > 12 ? "PM" : "AM"

        setAmpm(ampm)
        setTime(`${hour}:${minute}:${second}`)
    }

    setInterval(()=>{
        updateTime()
    },1000)

    return [time, ampm]
}

export default useClock