import React from 'react'
import MessageContext from "./MessageContext";
import Parent from "./Parent";

const Grandparent = () => {
    const message = "from grandparent"

    return (
        <MessageContext.Provider value={message}>
            <Parent/>
        </MessageContext.Provider>
    )
}

export default Grandparent