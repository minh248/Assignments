import React, {useContext} from 'react'
import MessageContext from "./MessageContext";

const Child = () => {
    const message = useContext(MessageContext)

    return (
        <div>
            <h1>Message from grandparent: {message}</h1>
        </div>
    )
}

export default Child