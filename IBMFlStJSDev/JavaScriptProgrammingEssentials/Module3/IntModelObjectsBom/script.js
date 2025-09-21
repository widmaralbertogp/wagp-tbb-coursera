/*
windows.alert("Display a simple alert dialog.");
windows.confirm("Shows a confirmation dialog");
windows.open(http://www.uc.edu.ve);
windows.close();
windows.location;
*/

// Mostrar información
console.log(window.innerWidth, window.innerHeight); // ancho y alto de la ventana
document.getElementById('container').textContent = "Windows witdh: " + window.innerWidth + " and windows Height: " + window.innerHeight;

// Abrir y cerrar ventanas/pestañas
const w = window.open('https://example.com', '_blank', 'width=800,height=600');
w.close();

// Temporizadores
const id = window.setTimeout(() => alert('Hola después de 2s'), 2000);
window.clearTimeout(id);

const intervalId = window.setInterval(() => console.log('tick'), 1000);
window.clearInterval(intervalId);

// requestAnimationFrame
let rafId = window.requestAnimationFrame((t)=> console.log('frame', t));
window.cancelAnimationFrame(rafId);
