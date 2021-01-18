//Q1
var name1 = "minh1"

function printName1(){
    var name2 = "minh2"
    console.log(name1);
    console.log(name2);
}

name1 = "changed"
// can't change name2

printName1()

//Q2
let name3 = "minh1"

function printName2(){
    let name4 = "minh2"
    console.log(name3);
    console.log(name4);
}

name3 = "changed"
// can't change name4

printName2()

//Q3
const name5 = "minh1"

function printName3(){
    let name6 = "minh2"
    console.log(name5);
    console.log(name6);
}

// can't change name5
// can't change name6

printName3()

//Q4
const a = [1,2,3]
a.push(4)

console.log(a);
// constant array don't allow to override but it still allow to change inside