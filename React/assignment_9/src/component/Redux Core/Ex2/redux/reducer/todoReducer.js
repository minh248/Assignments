import {ADD_TODO} from '../actionTypes'

const initalState = {
    todos: []
}

function todoReducer(state = initalState, action) {
    switch (action.type) {
        case ADD_TODO:
            return {
                ...state,
                todos: [...state.todos, action.payload]
            }
        default:
            return state
    }
}

export default todoReducer