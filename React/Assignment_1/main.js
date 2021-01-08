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
