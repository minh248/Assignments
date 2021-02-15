import React, {useState} from 'react'

const Message = () => {
    const [message, setMessage] = useState("")

    return (
        <div>
            <input
                type={"text"}
                value={message}
                placeholder={"Enter a message"}
                onChange={event => setMessage(event.target.value)}
            />

            <p>
                <strong>
                    {message}
                </strong>
            </p>
        </div>
    )
}

export default Message