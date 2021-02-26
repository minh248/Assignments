import React, {useState} from 'react'
import selectListTodos from "./redux/selector/todoSelector";
import store from "./redux/store";

const TodoList = () => {
    const [todos, setTodos] = useState(selectListTodos)

    const todoList = todos.map((item, index) =>
        <li key={index}> {item} </li>
    )

    const updateTodoList = () => {
        store.subscribe(() => setTodos(selectListTodos))
    }

    updateTodoList()

    return (
        <ul>
            {todoList}
        </ul>
    )
}

export default TodoList