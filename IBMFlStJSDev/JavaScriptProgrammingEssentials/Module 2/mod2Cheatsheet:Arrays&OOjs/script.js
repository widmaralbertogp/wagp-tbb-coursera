// Función auxiliar para mostrar resultados
function showResult(id, message) {
  document.getElementById(id).innerText = message;
}

// =================== ARRAYS ===================

// Crear un array
function arrayCrear() {
  let frutas = ["manzana", "banana", "pera"];
  showResult("result-array-crear", frutas);
}

// Acceso por índice
function arrayIndice() {
  let frutas = ["manzana", "banana", "pera"];
  showResult("result-array-indice", frutas[1]);
}

// Recorrer array
function arrayRecorrer() {
  let frutas = ["manzana", "banana", "pera"];
  let listado = "";
  for (let i = 0; i < frutas.length; i++) {
    listado += frutas[i] + " ";
  }
  showResult("result-array-recorrer", listado.trim());
}

// Métodos push y pop
function arrayPushPop() {
  let frutas = ["manzana", "banana"];
  frutas.push("pera");
  frutas.pop();
  showResult("result-array-pushpop", frutas);
}

// Array multidimensional
function arrayMulti() {
  let matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
  ];
  showResult("result-array-multi", matriz[1][2]); // imprime 6
}

// =================== OBJETOS ===================

// Objeto literal
function objetoLiteral() {
  let persona = { nombre: "Juan", edad: 30 };
  showResult("result-objeto-literal", persona.nombre + " - " + persona.edad);
}

// Acceso notación punto y corchete
function objetoAcceso() {
  let persona = { nombre: "Ana", edad: 25 };
  let texto = persona.nombre + " / " + persona["edad"];
  showResult("result-objeto-acceso", texto);
}

// Constructor de función
function objetoConstructorFuncion() {
  function Persona(nombre, edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  let juan = new Persona("Juan", 30);
  showResult("result-objeto-constructor", juan.nombre + " - " + juan.edad);
}

// Clase moderna
function objetoClase() {
  class Persona {
    constructor(nombre, edad) {
      this.nombre = nombre;
      this.edad = edad;
    }
  }
  let ana = new Persona("Ana", 28);
  showResult("result-objeto-clase", ana.nombre + " - " + ana.edad);
}

// Array de objetos
function arrayObjetos() {
  let personas = [
    { nombre: "Juan", edad: 30 },
    { nombre: "Ana", edad: 25 }
  ];
  let texto = personas[0].nombre + " & " + personas[1].nombre;
  showResult("result-array-objetos", texto);
}

// Iteración con forEach
function arrayObjetosForEach() {
  let personas = [
    { nombre: "Juan", edad: 30 },
    { nombre: "Ana", edad: 25 }
  ];
  let texto = "";
  personas.forEach(p => texto += p.nombre + " ");
  showResult("result-array-objetos-foreach", texto.trim());
}

// Uso de map
function arrayObjetosMap() {
  let personas = [
    { nombre: "Juan", edad: 30 },
    { nombre: "Ana", edad: 25 }
  ];
  let nombres = personas.map(p => p.nombre);
  showResult("result-array-objetos-map", nombres.join(", "));
}

// Uso de filter
function arrayObjetosFilter() {
  let personas = [
    { nombre: "Juan", edad: 30 },
    { nombre: "Ana", edad: 25 }
  ];
  let mayores = personas.filter(p => p.edad > 26);
  showResult("result-array-objetos-filter", mayores[0].nombre);
}

// Uso de find
function arrayObjetosFind() {
  let personas = [
    { nombre: "Juan", edad: 30 },
    { nombre: "Ana", edad: 25 }
  ];
  let encontrada = personas.find(p => p.nombre === "Ana");
  showResult("result-array-objetos-find", encontrada.nombre + " - " + encontrada.edad);
}

// Array anidado de objetos
function arrayObjetosAnidado() {
  let cursos = [
    { nombre: "JS", estudiantes: ["Juan", "Ana"] },
    { nombre: "Python", estudiantes: ["Luis", "Marta"] }
  ];
  showResult("result-array-objetos-anidado", cursos[1].estudiantes[0]);
}
