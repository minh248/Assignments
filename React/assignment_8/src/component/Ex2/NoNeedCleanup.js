import React, {useEffect, useState} from 'react'

function NoNeedCleanup() {
    const [count, setCount] = useState(0)

    useEffect(() => {
        document.title = `You click ${count} times`
    })

    return (
        <>
            <p>You click {count} times</p>
            <button onClick={() => setCount(count + 1)}> Click me</button>
        </>
    )
}

export default NoNeedCleanup