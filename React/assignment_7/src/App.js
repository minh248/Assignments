import './App.css';
import React from 'react'
import EmployeeContainer from "./hocComponent/Example_2/EmployeeContainer";
import AuthenticatedContext from "./hocComponent/context/AuthenticatedContext";
import MyComponent from "./renderPropsComponent/Ex1/MyComponent";
import UserContainer from "./hocComponent/Example_1/UserContainer";

class App extends React.Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {
    //         isAuthenticated: true
    //     }
    // }

    render() {
        return (
            <>
                {/*<AuthenticatedContext.Provider value={this.state.isAuthenticated}>*/}
                {/*    <EmployeeContainer/>*/}
                {/*</AuthenticatedContext.Provider>*/}

                {/*<MyComponent/>*/}
                <UserContainer/>
            </>
        );
    }
}

export default App;
