import React from 'react'
import './Q1.css'
import styles from './Q1.module.css'
import styled from 'styled-components'

class Q1 extends React.Component{
    render() {
        const inlineStyleUsingObject = {
            color:"Green",
            backgroundColor: "lightBlue",
            padding: "10px",
            fontFamily: "Arial"
        }

        const H1 = styled.h1`
            color: green;
            background-color: lightBlue;
            padding: 10px;
            font-family: "Arial";
        `

        return (
            <div>
                <h1 style={{color:"Green", backgroundColor: "lightBlue", padding: "10px", fontFamily: "Arial"}}>Inline Styling (directly)</h1>
                <h1 style={inlineStyleUsingObject}>Inline Styling Using Object</h1>
                <h1 className={"css-stylesheet"}>CSS Stylesheet</h1>
                <h1 className={styles.cssStylesheet}>CSS Module</h1>
                <H1>CSS in JS: Styled Component</H1>
            </div>
        );
    }
}

export default Q1