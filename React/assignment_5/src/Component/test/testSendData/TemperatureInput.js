import React from 'react'

class TemperatureInput extends React.Component {


    render() {
        return (
            <>
                <legend>Enter temperature in {this.props.typeOfTemperature}: </legend>
                <input type="number" value={this.props.temperature} onChange={event => this.props.dataFlow(event.target.value)}/>
            </>
        );
    }
}

export default TemperatureInput