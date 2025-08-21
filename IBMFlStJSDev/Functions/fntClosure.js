function outerFunction() {
    const outerVar = "I am from the outer function";
    function innerFunction() {
        console.log(outerVar); //innerFunction can access outerVar
    }
    return innerFunction;
}

const closure = outerFunction();
closure();      // This will log "I am from the outer function"

/* 
    Importance of function closure
    - State persistence
        . Implements counter, timers
        . Manages app state
*/

function greet(name) 
{
    const greeting = "Hello, ";

    function sayHello()
    {
        console.log(greeting + name);
    }
    return sayHello;
}

const greetJohn = greet("John");
const greetAlice = greet("Alice");

greetJohn();    //output "Hello, John"
greetAlice();   //output "Hello, Alice"

/* 
    Function hosting: example    
    this works even though the function is colled 
    before it's declared.
*/

sayHI();

function sayHI() 
{
    console.log("Hello!")
}

/*
    Function expression
 */

greets();    // this will result in an error

const greets = function()
{
    console.log("Greetings!");
}
