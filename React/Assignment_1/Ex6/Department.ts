export class Department{
    private id
    private name

    constructor(id, name) {
        this.id = id
        this.name = name
    }


    get getId() {
        return this.id
    }

    set setId(id) {
        this.id = id
    }

    get getName() {
        return this.name;
    }

    set setName(name) {
        this.name = name
    }
}

export default function printDepartment(department){
    console.log(department.getId + ", "  + department.getName)
}