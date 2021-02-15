import React, {useState}from 'react'

function Example() {
    const [count, setCount] = useState(0)

    return (
        <div>
            <br/>
            <p>You click {count} times</p>
            <button onClick={() => {setCount(count + 1)}}>
                Click here
            </button>
        </div>
    )
}

export default Example