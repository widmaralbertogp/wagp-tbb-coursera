//Creating a Person Class
class Person 
{
    constructor(firstName, lastName) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    getFullName() 
    {
        return `${this.firstName} ${this.lastName}`;
    }
}

//Creating an instance of Person class
const person1 = new Person("Jhon", "Doe");
console.log(person1.getFullName());
document.getElementById("info").innerHTML = person1.getFullName();  

class Car 
{
    constructor(make, model, year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    startEngine()
    {
        document.getElementById("car").innerHTML = `The ${this.make}, ${this.model}, ${this.year}'s engine running`;  
    }
}
const myCar = new Car("Toyota","Camry", 2022);
myCar.startEngine();

//Create ad hoc objects
const persona = {
    firstName: "Alice",
    lastName: "Johnson",
    getFullName() 
    {
        return `${this.firstName} ${this.lastName}`;
    }
};
document.getElementById("persona").innerHTML = persona.getFullName();

/* 
    function constructor
        - Used to create and initialize objects
        - Named with a capital letter
*/
function Cars(make, model)
{
    this.make = make;
    this.model = model;
}

const car1 = new Cars("Toyota", "Camry");
const car2 = new Cars("Honda", "Civic");

document.getElementById("cars1").innerHTML = `Car1 details are: ${car1.make}, ${car1.model}`;  
document.getElementById("cars2").innerHTML = `Car2 details are: ${car2.make}, ${car2.model}`;  

/*
    Try-catch block: Example 1
    With try-catch block
*/

const obj2 = undefined;
try {
    const propertyValue2 = obj2.property;
    //document.getElementById("proper2").innerHTML = `The Property Value: ${propertyValue2}`;              
    console.log("Property Value: " + propertyValue2);    
    //document.getElementById("proper2").innerHTML = `This message will be reached.`;              
    console.log("This message wil be reached.");
} 
catch (error)
{
  //  document.getElementById("proper2").innerHTML = `An error ocurred while accessing the property: ${error.message}`;    
    console.error("Widmar an error occurred while accessing the property: ", error.message);
}
//document.getElementById("errorMsg").innerHTML = "Program continues after error handling";
console.log("Program continues after error handling.");

/*
    Try-catch block: Example 1

    Access property of undefined object
    Without try-catch block
*/

const obj = undefined;
const propertyValue = obj.property; //Attempting to access a property of an undefined object 

document.getElementById("proper").innerHTML = `The Property Value: ${propertyValue}`;  

/*
    Try-catch block: Example 2

    Access undefined array object
    Without try-catch block
*/

const arr = [1, 2, 3];
const element = arr[5].nonExistentPropert; 

document.getElementById("arro").innerHTML = `The Array Element: ${element}`
document.getElementById("arroMsg").innerHTML = `This message will never be reached`