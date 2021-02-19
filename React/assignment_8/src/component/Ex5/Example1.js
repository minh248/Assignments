import React, {useState, useMemo, useEffect} from 'react'

const Example1 = () => {
    const [a, setA] = useState(0)
    const [b, setB] = useState(0)

    const [counter, setCounter] = useState(0)

    useEffect(() => {
        console.log("Render")
        return () => console.log("Unmouting")
    })

    const sum = (a, b) => {
        console.log("Calculating ...")
        return a + b
    }

    const sumResult = useMemo(() => sum(a, b), [a, b])

    return (
        <div>
            <form>
                <label>
                    <input type="number" value={a} onChange={(e)=>setA(parseInt(e.target.value))}/>
                </label>
                <br/>
                <label>
                    <input type="number" value={b} onChange={(e)=>setB(parseInt(e.target.value))}/>
                </label>
                <br/>
            </form>

            <label>sum: {sumResult}</label>

            <p>Counter: {counter}</p>
            <button onClick={()=> setCounter(counter + 1)}> Increase counter</button>
        </div>
    )
}

export default Example1