import React from 'react'

class Q3 extends React.Component{
    constructor(props) {
        super(props);
        this.textInput  = React.createRef()
    }

    handleSubmit = (event) => {
        event.preventDefault()
        alert('A name was submitted: ' + this.textInput.current.value)
    }

    render() {
        return (
            <>
                <form onSubmit={this.handleSubmit}>
                    <input type="text" ref={this.textInput } />
                    <input type="submit"/>
                </form>
            </>
        );
    }
}

export default Q3


