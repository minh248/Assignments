import React from "react";
import TemperatureInput from "./TemperatureInput";

class Calculator extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            temperature: ""
        }
    }

    toCelsius = (fahrenheit) => {
        return (fahrenheit - 32) * 5 / 9
    }

    toFahrenheit = (celsius) => {
        return celsius * 9 / 5 + 32
    }

    handleCelsiusChange = (celsius) => {
        this.setState({
            temperature: celsius
        })
    }

    handleFahrenheitChange = (fahrenheit) => {
        this.setState({
            temperature: this.toCelsius(fahrenheit)
        })
    }

    render() {
        const celsius = this.state.temperature === "" ? "" : this.state.temperature
        const fahrenheit = this.state.temperature === "" ? "" : this.toFahrenheit(this.state.temperature)

        return (
            <div>
                <TemperatureInput
                    temperature={celsius}
                    typeOfTemperature={"celsius"}
                    dataFlow={this.handleCelsiusChange}
                />
                <TemperatureInput
                    temperature={fahrenheit}
                    typeOfTemperature={"fahrenheit"}
                    dataFlow={this.handleFahrenheitChange}
                />
            </div>
        );
    }
}

export default Calculator;