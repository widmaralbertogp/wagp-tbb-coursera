const middle = document.querySelector("p:nth-child(2)");
const previousSibling = middle.previousSibling;
const nextSibling = middle.nextSibling;
const firstChild = middle.firstChild;
const lastChild = middle.lastChild;

console.log(previousSibling.textContent);
console.log(nextSibling.textContent);

console.log(firstChild.textContent);
console.log(lastChild.textContent);