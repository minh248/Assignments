import React from 'react'

function WarningBanner(props) {
    if (!props.warn){
        return null;
    }

    return (
        <div className={"warning"}>
            Warning!
        </div>
    )
}

class Q3 extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            showWarning: true
        }
    }

    handleToggleClick = () => {
        this.setState(prevState => ({
            showWarning: !prevState.showWarning
        }))
    }

    render() {
        console.log("re-render")
        console.log(true)
        return (
            <div>
                <button onClick={this.handleToggleClick}>
                    {this.state.showWarning ? "Hide" : "Show"}
                </button>
                <WarningBanner warn={this.state.showWarning}/>
            </div>
        );
    }
}

export default Q3