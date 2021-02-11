import React from 'react'
import {ThemeContext} from "./ThemeContext";

class Child extends React.Component {
    static contextType = ThemeContext

    render() {

        console.log(this.context)
        return (
            <>
                <p style={{backgroundColor: this.context.backgroundColor, color: this.context.color}}>minh</p>
            </>
        )
    }
}

export default Child