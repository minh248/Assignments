import React from 'react'
import Example from "./component/Ex1/Example";
import LessText from "./component/Ex1/a";
import Message from "./component/Ex1/b";
import Lifecycle from "./component/Ex2/Lifecycle/Lifecycle";
import NoNeedCleanup from "./component/Ex2/NoNeedCleanup";

function App() {
    return (
        <div>
            {/*Ex1*/}
            {/*<Example/>*/}
            {/*<LessText text={"Focused, hard work is the real key\n" +*/}
            {/*"      to success. Keep your eyes on the goal, \n" +*/}
            {/*"      and just keep taking the next step \n" +*/}
            {/*"      towards completing it."} maxLength={35}/>*/}
            {/*<Message/>*/}
            {/*<Lifecycle/>*/}
            <NoNeedCleanup/>
        </div>
    )
}

export default App;
