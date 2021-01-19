import './App.css'
import Person from './Person'

function hello() {
  console.log("hello");
}

var fullName = "Duc Minh"
var age = 20


function App() {
  return (
      <div>
          <Person fullName={fullName} age={age} />
      </div>
  )
}

export default App;
