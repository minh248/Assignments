import React from 'react'

class Q2 extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            fullName: ""
        }
    }

    handleChange = (event) => {
        this.setState({
            fullName: event.target.value
        })
    }

    render() {
        return (
            <>
                <h1>Full name: {this.state.fullName}</h1>
                <input type="text" onChange={this.handleChange}/>
            </>
        );
    }
}

export default Q2