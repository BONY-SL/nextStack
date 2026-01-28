let animals = ['cat', 'dog', 'elephant', 'giraffe', 'lion'];
console.log('Animals in the list:' + animals.join(', '));
console.log(animals);
console.log(typeof animals);


let dilshan = {
    name: 'Dilshan',
    age: 25,
    isStudent: false,
    skills: ['JavaScript', 'Python', 'C++'],
    address: {
        street: '123 Main St',
        city: 'Colombo',
        country: 'Sri Lanka'
    },
    coding () {
        console.log(`${this.name} is coding in ${this.skills[0]}`);
    }
}

//dilshan.coding();

class Person{
    setName(name){
        this.name=name;
        return this;
    }
    setAge(age){
        this.age=age;
        return this;
    }
}

let gihan=new Person().setName('Gihan').setAge(27);

console.log(gihan);

class Animal {
    constructor(breed,color){
        this.breed=breed;
        this.color=color;
    }
    speek(){
        console.log('Animal sound');
    }
}

class Cat extends Animal {
    constructor(breed,color){
        super(breed,color);
    }
    speek(){
        console.log('Meow Meow');
    }
}

class Dog extends Animal {
    constructor(breed,color){
        super(breed,color);
    }
    speek(){
        console.log('Woof Woof');
    }
}
let dog=new Dog('Labrador','Yellow');
let animal=new Animal('Animal','Sound');
let cat=new Cat('Siamese','White');

console.log(animal);
animal.speek();

console.log(dog);
dog.speek();

console.log(cat);
cat.speek();
