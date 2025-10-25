const container = document.getElementById("container");
const singleElement = container.querySelector(".myClass");
const multipleElements = container.querySelectorAll(".myClass");

console.log(singleElement.textContent);
console.log(multipleElements[1].textContent);