var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
// Q1
var f1 = "f1";
var f3 = "f3";
function hello(f3) {
    // global scope
    console.log(f1);
    // function scope
    var f2 = "f2";
    console.log(f2);
    // lexical scope
    function lexical() {
        return f3;
    }
    console.log(lexical());
}
hello(f3);
// Q2
function printName() {
    console.log("Minh");
}
var myName = printName();
myName;
// Q3
function getGreeting(firstName, lastName) {
    function greeting() {
        return firstName + " " + lastName;
    }
    console.log(greeting());
}
getGreeting("Duc", "Minh");
// Q4
function printNumberEverySeccond(maxNumber) {
    var _loop_1 = function (i) {
        setTimeout(function () {
            console.log(i + 1);
        }, i * 1000);
    };
    for (var i = 0; i < maxNumber; i++) {
        _loop_1(i);
    }
}
printNumberEverySeccond(5);
// Q5
var operator = {
    SQR: "squared",
    SQRT: "square root"
};
function factory(num, operator) {
    if (operator === "squared") {
        return sqrt();
    }
    else if (operator === "square root") {
        return sqr();
    }
    function sqr() {
        return Math.pow(num, 2);
    }
    ;
    function sqrt() {
        return Math.sqrt(num);
    }
    ;
}
console.log(factory(4, operator.SQR));
console.log(factory(4, operator.SQRT));
// Q6
var personTemplate = {
    id: 0,
    name: null
};
function createPerson(name) {
    personTemplate.id++;
    var person = __assign({}, personTemplate);
    person.name = name;
    return person;
}
var person1 = createPerson("minh");
