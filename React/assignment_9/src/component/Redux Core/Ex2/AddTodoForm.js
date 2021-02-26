import React, {useState} from 'react'
import store from "./redux/store";
import addTodoAction from "./redux/actionCreator/todoActionCreator";

const AddTodoForm = () => {
    const [input, setInput] = useState("")

    const updateInput = event => {
        setInput(event.target.value)
    }

    const handleAddTodo = () => {
        store.dispatch(addTodoAction(input))
        setInput("")
    }

    return (
        <div>
            <input type={"text"} onChange={updateInput} value={input}/>
            <button onClick={handleAddTodo}> Add Todo</button>
        </div>
    )
}

export default AddTodoForm