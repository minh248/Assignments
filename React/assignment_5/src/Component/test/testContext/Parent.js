import React from 'react'
import Child from "./Child";
import {ThemeContext, themes} from "./ThemeContext";

class Parent extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            themeSetting : themes.light
        }
    }

    changeTheme = () => {
        this.setState({
            themeSetting: this.state.themeSetting === themes.dark ? themes.light : themes.dark
        })
    }

    render() {
        return (
            <ThemeContext.Provider value={this.state.themeSetting}>
                <Child/>
                <button onClick={this.changeTheme}>Change theme</button>
            </ThemeContext.Provider>
        )
    }
}

export default Parent