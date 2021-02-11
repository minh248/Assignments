import React from 'react'

class Q2 extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            message: "hello"
        }
    }

    render() {
        return (
            <div>
                <h3>{this.state.message}</h3>
                <button onClick={this.changeMessage}>Change message</button>
            </div>
        );
    }

    componentDidMount() {
        console.log("componentDidMount");
    }

    changeMessage = () => {
        this.setState({
            message: "Hello World"
        })
        console.log("Change message")
    }

    shouldComponentUpdate(nextProps, nextState, nextContext) {
        console.log("shouldComponentUpdate: " + true)
        return true
    }

    componentDidUpdate(prevProps, prevState, snapshot) {
        console.log("componentDidUpdate")
    }

    componentWillUnmount() {
        console.log("componentWillUnmount")
    }

    componentDidCatch(error, errorInfo) {
        console.log("componentDidCatch")
    }
}

export default Q2