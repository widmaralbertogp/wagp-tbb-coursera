/*
//Access undefined array object
//Without Try-catch block:

const arr = [1, 2, 3];
const element = arr[5].nonExistentProperty; 
//Attempting to access a property of an undefined value.-

console.log("Array element: " + element);
console.log("This message will never be reached."):

*/

const arr = [1, 2, 3];
try 
{
    const element = arr[5];
    //Attempting to access a property of an undefined value.-   

    console.log("Array element: " + element);
    console.log("This message will be reached.");   
} 
catch (error) 
{
    console.log("An error ocurred while accessing the array element: ", error.message);
}
console.log("Program continues after error handling");