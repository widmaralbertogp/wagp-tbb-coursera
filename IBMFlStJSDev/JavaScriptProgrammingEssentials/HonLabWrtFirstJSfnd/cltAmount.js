let Amount1;
let Amount2;
let Amount3;


function groceryTracker() 
{
 Amount1 = parseFloat(document.getElementById('Grocery1').value);
 Amount2 = parseFloat(document.getElementById('Grocery2').value);
 Amount3 = parseFloat(document.getElementById('Grocery3').value);

let tamount = Amount1 + Amount2 + Amount3;
document.getElementById('result').innerText = `The total amount is: ${tamount}`;
}