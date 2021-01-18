//Q1
function multiply1(a, b = 1) {
    return a * b
}

//Q2
function multiply2(...value) {
    var r = 1
    for (var v of value) {
        r = r * v
    }
    return r
}

//Q3
function printInformation(name, mail?){
    if (mail == null){
        console.log(`tôi là ${name}. Tôi chưa có Email`)
    } else {
        console.log(`tôi là ${name}. Email của tối là ${mail}`)

    }
}

printInformation("Nam")
printInformation("Nam","Namvv20@gmail.com")