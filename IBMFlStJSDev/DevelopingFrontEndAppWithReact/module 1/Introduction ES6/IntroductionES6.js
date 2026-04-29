/*
{
    let num = 5;
    console.log(num);
    num = 6;
    console.log(num);
}
console.log(num);

{
    const numA = 5;
    console.log(numA);
    numA = 6;
    console.log(numA);
}
    */
// Arrow functions
const sayHello = () => console.log("ES6 function - Hello World!")
sayHello();
// Calling arrow functions
// Arrow functions can be called
// Arrow functions can be passed as parameters for callbacks
// Pass sayHello() as a callback parameter to setTimeout()
setTimeout(sayHello,1000);
// Arrow functions with parameters
// Take parameters like normal functions
// Can return a data type or an object
const oneParamArrowFunc = name => { return "hello " + name};
oneParamArrowFunc();
// function retrive 2 parameters
const twoParamsArrowFuncWithoutReturn = (first, last)=> console.log("Hello "+ first+" "+ last);
twoParamsArrowFuncWithoutReturn('Widmar','Gomez');
// recibe 2 params and return one value
const twoParamsArrowFuncWithReturn = (first, last) => {
     return "Hello " + first+" "+ last
}
twoParamsArrowFuncWithReturn('Widmar','Gomez');

// recibe 2 params y tiene 2 lines
const twoParamsTwoLinesArrowFunc = (first, last) => {
    const greeting = "Hello"; return greeting +" "+ first+" "+ last
}
twoParamsTwoLinesArrowFunc('Widmar','Gomez');

//Promise example
// function with two params
let promiseArgument = (resolve, reject) => {
    setTimeout(()=>{
        let currTime = new Date().getTime();
        if(currTime % 2 === 0){
            resolve("Success!");
        }else {
            reject("Failed!!!");
        }
    },2000);
};
let myPromise = new Promise(promiseArgument);

// Promise example 2
let myPromise2 = new Promise((resolve, reject) => {
    setTimeout(() => {
        let currTime2 = new Date().getTime();
        if (currTime2 % 2 === 0){
            resolve("Success!");
        }else {
            reject("Failed!!!");
        }
    },2000);
});

myPromise2
    .then((message) => console.log(message))
    .catch((error) => console.error(error));

// Classes

class Person {
    constructor(name,age) {
        this.name = name;
        this.age = age;
    }}        
let person1 = new Person("Jason",20);
console.log(person1);
console.log(person1.name);
console.log(person1.age);

// Class Constructor

class Rectangle {
    constructor(height, width){
        this.height = height;
        this.width = width;
        console.log("Rectangle Created");
        console.log("Height " + this.height);
        console.log("Width " + this.width);
    }
};

let myRectangle = new Rectangle(10,5);

// Herencia / Inheritance

class Square extends Rectangle {
    constructor(height,width){
        super(height,width);
    }
}

let MySquare = new Square(5,5);