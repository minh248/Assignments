import React from 'react'
import Login from "./Login";
import AuthenticatedContext from "../../context/AuthenticatedContext";

function WithAuth(AuthenticatedComponent) {
    class HOC extends React.Component {
        isAuthenticated = () => {
            console.log(this.context)
            return this.context
        }

        render() {
            return (
                !this.isAuthenticated() ? <Login/> : <AuthenticatedComponent {...this.props}/>
            )
        }
    }

    HOC.displayName = `WithAuth(${getDisplayName(AuthenticatedComponent)})`
    HOC.contextType = AuthenticatedContext
    return HOC
}

function getDisplayName(WrappedComponent){
    return WrappedComponent.displayName || WrappedComponent.name || "Component"
}

export default WithAuth