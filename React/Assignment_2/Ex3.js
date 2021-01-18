var __spreadArrays = (this && this.__spreadArrays) || function () {
    for (var s = 0, i = 0, il = arguments.length; i < il; i++) s += arguments[i].length;
    for (var r = Array(s), k = 0, i = 0; i < il; i++)
        for (var a = arguments[i], j = 0, jl = a.length; j < jl; j++, k++)
            r[k] = a[j];
    return r;
};
//Q1
var a1 = [2, 4, 6, 8, 10];
var a2 = __spreadArrays(a1, [5, 7, 9]);
//Q2
var a3 = __spreadArrays(a2);
//Q3
var cold = ["autumn", "winter"];
var warm = ["spring", "summer"];
var season = __spreadArrays(warm, cold);
