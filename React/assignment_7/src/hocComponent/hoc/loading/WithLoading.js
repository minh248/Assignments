import React from 'react'

function WithLoading(WrappedComponent) {
    class HOC extends React.Component {
        render() {
            if (this.props.isLoading){
                return (
                    <>
                        <p>Loading...</p>
                    </>
                )
            }

            return (
                <>
                    <WrappedComponent {...this.props}/>
                </>
            );
        }
    }

    HOC.displayName = `WithLoading(${getDisplayName(WrappedComponent)})`
    return HOC
}

function getDisplayName(WrappedComponent){
    return WrappedComponent.displayName || WrappedComponent.name || "Component"
}

export default WithLoading