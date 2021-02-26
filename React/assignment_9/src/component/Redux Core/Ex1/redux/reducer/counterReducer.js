import React from 'react'

const initalState = {
    value: 0
}

function counterReducer(state = initalState, action) {
    switch (action.type) {
        case 'counter/incremented':
            return {
                ...state,
                value: state.value + 1
            }
        case 'counter/decremented':
            return {
                ...state,
                value: state.value - 1
            }
        default:
            return state
    }
}

export default counterReducer