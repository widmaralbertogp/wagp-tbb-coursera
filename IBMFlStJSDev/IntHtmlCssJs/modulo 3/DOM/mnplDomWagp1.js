/* creating my first div container on body */
const container = document.createElement("div");
const texto = document.createTextNode("Widmar Alberto Gómez Pérez");

container.id = "myContainer";
document.body.appendChild(texto);

document.body.appendChild(container);

container.appendChild(document.createElement('br'));

const navo  = document.createElement("nav");
navo.className = "menu";
container.appendChild(navo);

const divmnu1 = document.createElement("div");
navo.appendChild(divmnu1);
divmnu1.className = "menu-item"
divmnu1.textContent = "Inicio";

const divmnu2 = document.createElement("div");
navo.appendChild(divmnu2);
divmnu2.className = "menu-item"
divmnu2.textContent = "Sobre mi";

const divmnu3 = document.createElement("div");
navo.appendChild(divmnu3);
divmnu3.className = "menu-item"
divmnu3.textContent = "Proyectos";

const divmnu4 = document.createElement("div");
navo.appendChild(divmnu4);
divmnu4.className = "menu-item"
divmnu4.textContent = "Hoja de vida";

const divmnu5 = document.createElement("div");
navo.appendChild(divmnu5);
divmnu5.className = "menu-item"
divmnu5.textContent = "Contacto";

const divmnu6 = document.createElement("div");
navo.appendChild(divmnu6);
divmnu6.className = "menu-item"
divmnu6.textContent = "Skills";

const divmnu7 = document.createElement("div");
navo.appendChild(divmnu7);
divmnu7.className = "menu-item"
divmnu7.textContent = "Servicios";