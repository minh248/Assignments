import React, {useState} from 'react'
import './a.module.css'

function LessText({text, maxLength}) {
    const [hidden, setHidden] = useState(true)

    if (text < maxLength) {
        return <span>{text}</span>
    }

    return (
        <span>
            {hidden
                ? `${text.substr(0, maxLength).trim()} ...`
                : text}
            {hidden ? (
                <a onClick={() => setHidden(false)}> <u>read more</u> </a>
            ) : (
                <a onClick={() => setHidden(true)}> <u>read less</u> </a>
            )}
    </span>
    )
}

export default LessText