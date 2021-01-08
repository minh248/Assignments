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

