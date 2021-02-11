import React from 'react';
import Mouse from "./Mouse";

function MyComponent() {
    return (
        <Mouse>
            {coordinate => (<div>The mouse position is: {coordinate.x} : {coordinate.y}</div>)}
        </Mouse>
    );
}

export default MyComponent