import React from 'react'
import Calculator from "./testSendData/Calculator";
import Parent from "./testContext/Parent";

class Test extends React.Component{
    constructor(props) {
        super(props);

    }

    render() {
        return (
            <>
                {/*<Calculator/>*/}
                <Parent/>
            </>
        );
    }
}

export default Test