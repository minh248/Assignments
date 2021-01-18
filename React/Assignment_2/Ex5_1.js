//Q1
function multiply1(a, b) {
    if (b === void 0) { b = 1; }
    return a * b;
}
//Q2
function multiply2() {
    var value = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        value[_i] = arguments[_i];
    }
    var r = 1;
    for (var _a = 0, value_1 = value; _a < value_1.length; _a++) {
        var v = value_1[_a];
        r = r * v;
    }
    return r;
}
//Q3
function printInformation(name, mail) {
    if (mail == null) {
        console.log("t\u00F4i l\u00E0 " + name + ". T\u00F4i ch\u01B0a c\u00F3 Email");
    }
    else {
        console.log("t\u00F4i l\u00E0 " + name + ". Email c\u1EE7a t\u1ED1i l\u00E0 " + mail);
    }
}
printInformation("Nam");
printInformation("Nam", "Namvv20@gmail.com");
