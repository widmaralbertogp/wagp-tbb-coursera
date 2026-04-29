// Accedemos al DOM
const listaTareas = document.getElementById("listaTareas");
const nuevaTarea = document.getElementById("nuevaTarea");
const agregarBtn = document.getElementById("agregarBtn");

// Escuchamos el evento click del botón
agregarBtn.addEventListener("click", () => 
{
  const texto = nuevaTarea.value.trim();

  // Validamos que no esté vacío
  if (texto !== "") {
    // Creamos un nuevo elemento <li>
    const li = document.createElement("li");
    li.textContent = texto;

    // Creamos botón de eliminar
    const eliminarBtn = document.createElement("button");
    eliminarBtn.textContent = "❌";
    eliminarBtn.style.marginLeft = "10px";

    // Evento para eliminar el elemento <li>
    eliminarBtn.addEventListener("click", () => {
      listaTareas.removeChild(li);
    });

    // Añadimos el botón al <li> y luego lo agregamos a la lista
    li.appendChild(eliminarBtn);
    listaTareas.appendChild(li);

    // Limpiamos el input
    nuevaTarea.value = "";
  }
});
