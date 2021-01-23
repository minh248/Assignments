import React from 'react'
import TableColumns from "./TableColumns";
import TableHeader from "./TableHeader";
import './stylesheet.css'

class Ex1 extends React.Component{
    render() {
        return (
            <React.Fragment>
                <p>some text</p>
                <h1>A heading</h1>
                <p>more text</p>
                <h1>Another heading</h1>
                <p>even more text</p>
                <br/>

                <table>
                    <TableHeader/>
                    <TableColumns/>
                </table>
            </React.Fragment>
        )
    }
}

export default Ex1