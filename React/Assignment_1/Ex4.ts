// Q1
var f1 = "f1"
var f3 = "f3"

function hello(f3){
    // global scope
    console.log(f1);

    // function scope
    var f2 = "f2"
    console.log(f2)

    // lexical scope
    function lexical() {
        return f3
    }
    console.log(lexical())
}
hello(f3)

// Q2
function printName() {
    console.log("Minh")
}
var myName = printName()
myName

// Q3
function getGreeting(firstName, lastName) {
    function greeting() {
        return firstName + " " + lastName
    }

    console.log(greeting())
}
getGreeting("Duc", "Minh")

// Q4
function printNumberEverySeccond(maxNumber) {
    for (let i = 0; i < maxNumber; i++) {
        setTimeout(()=>{
            console.log(i + 1)
        }, i * 1000)
    }
}
printNumberEverySeccond(5)

// Q5
const operator = {
    SQR: "squared",
    SQRT: "square root"
}

function factory(num, operator) {
    if(operator === "squared"){
        return sqrt()
    } else if (operator === "square root"){
        return sqr()
    }

    function sqr(){
        return Math.pow(num, 2)
    };

    function sqrt(){
        return Math.sqrt(num)
    };
}
console.log(factory(4, operator.SQR))
console.log(factory(4, operator.SQRT))

// Q6
const personTemplate = {
    id: 0,
    name: null
}

function createPerson(name){
    personTemplate.id++
    let person = {...personTemplate}
    person.name = name

    return person
}

let person1 = createPerson("minh")
