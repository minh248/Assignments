var numbers = [1,2,3,4,5]

const newMapMethod = (callback) => {
    const newArray = []

    for (let arrElement of arr) {
        newArray.push(callback(arrElement))
    }

    return newArray
}

console.log(numbers.map())