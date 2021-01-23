import React from 'react'

class Q1 extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            fullName: "",
            value: ""
        }
    }

    handleChange = (event) => {
        this.setState({
            fullName: event.target.value
        })
    }

    handleSubmit = (event) => {
        alert(this.state.fullName)
        event.preventDefault()
    }

    handleSelect = (event) => {
        alert(event.target.value)
    }

    render() {
        return (
            <>
                <div>
                    <form onSubmit={this.handleSubmit}>
                        <label>Name: </label>
                        <input type="text" onChange={this.handleChange}/>
                        <input type="submit"/>
                    </form><br/>
                    <select name="q2" id="q2" onChange={this.handleSelect}>
                        <option value="A">A</option>
                        <option value="B">B</option>
                        <option value="C">C</option>
                    </select>
                </div>
            </>
        );
    }
}

export default Q1