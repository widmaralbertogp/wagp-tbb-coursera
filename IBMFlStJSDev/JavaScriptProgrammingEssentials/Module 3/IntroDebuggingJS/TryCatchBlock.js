/* 
//without try-Catch block
const obj = undefined;

const propertyValue = obj.property; 
// Attempting to access a property of a undefined object

console.log(" Property value: " + propertyValue);
console.log("This message will never be reached.");
*/

//With try-catch block
const obj = undefined;
try
{
    const propertyValue = obj.property; 
    // Attempting to access a property of a undefined object

    console.log(" Property value: " + propertyValue);
    console.log("This message will never be reached.");
} 
catch (error)
{
    console.log("An error ocurred while accessing the property: ", error.message);
}
