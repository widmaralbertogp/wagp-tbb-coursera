const arrayBase = [1, 2, 3, 4, 5];
const output = document.getElementById("output");

const metodos = {
  push: {
    descripcion: "Añade un elemento al final del array.",
    funcion: () => { 
      let arr = [...arrayBase]; 
      arr.push(6); 
      return arr; 
    }
  },
  pop: {
    descripcion: "Elimina el último elemento del array.",
    funcion: () => { 
      let arr = [...arrayBase]; 
      arr.pop(); 
      return arr; 
    }
  },
  shift: {
    descripcion: "Elimina el primer elemento del array.",
    funcion: () => { 
      let arr = [...arrayBase]; 
      arr.shift(); 
      return arr; 
    }
  },
  unshift: {
    descripcion: "Añade un elemento al inicio del array.",
    funcion: () => { 
      let arr = [...arrayBase]; 
      arr.unshift(0);
      return arr; 
    }
  },
  concat: {
    descripcion: "Concatena dos arrays.",
    funcion: () => arrayBase.concat([6, 7])
  },
  slice: {
    descripcion: "Extrae una porción del array (índices 1 a 3).",
    funcion: () => arrayBase.slice(1, 3)
  },
  splice: {
    descripcion: "Elimina un elemento desde índice 2.",
    funcion: () => { 
      let arr = [...arrayBase]; 
      arr.splice(2, 1); 
      return arr; 
    }
  },
  indexOf: {
    descripcion: "Devuelve el índice de la primera ocurrencia del valor 3.",
    funcion: () => arrayBase.indexOf(3)
  },
  lastIndexOf: {
    descripcion: "Devuelve el índice de la última ocurrencia del valor 2 en otro array.",
    funcion: () => [1, 2, 3, 2, 1].lastIndexOf(2)
  },
  includes: {
    descripcion: "Verifica si el array incluye el valor 4.",
    funcion: () => arrayBase.includes(4)
  },
  find: {
    descripcion: "Encuentra el primer número mayor que 3.",
    funcion: () => arrayBase.find(num => num > 3)
  },
  findIndex: {
    descripcion: "Encuentra el índice del primer número mayor que 3.",
    funcion: () => arrayBase.findIndex(num => num > 3)
  },
  filter: {
    descripcion: "Filtra los números pares.",
    funcion: () => arrayBase.filter(num => num % 2 === 0)
  },
  map: {
    descripcion: "Multiplica cada número por 2.",
    funcion: () => arrayBase.map(num => num * 2)
  },
  reduce: {
    descripcion: "Suma todos los números.",
    funcion: () => arrayBase.reduce((a, b) => a + b, 0)
  },
  some: {
    descripcion: "Verifica si hay algún número mayor que 4.",
    funcion: () => arrayBase.some(num => num > 4)
  },
  every: {
    descripcion: "Verifica si todos los números son mayores que 0.",
    funcion: () => arrayBase.every(num => num > 0)
  },
  reverse: {
    descripcion: "Invierte el orden del array.",
    funcion: () => { 
      let arr = [...arrayBase]; 
      arr.reverse(); 
      return arr; 
    }
  },
  sort: {
    descripcion: "Ordena el array de mayor a menor.",
    funcion: () => [...arrayBase].sort((a, b) => b - a)
  },
  join: {
    descripcion: "Une los elementos en un string separados por ' - '.",
    funcion: () => arrayBase.join(" - ")
  }
};

// Crear botones dinámicamente
const buttonsContainer = document.getElementById("buttons");

Object.entries(metodos).forEach(([metodo, { descripcion, funcion }]) => {
  const btn = document.createElement("button");
  btn.textContent = metodo;
  btn.addEventListener("click", () => {
    const resultado = funcion();
    output.innerHTML = `
      <h3>${metodo}</h3>
      <p><em>${descripcion}</em></p>
      <strong>Resultado:</strong>
      <pre>${JSON.stringify(resultado, null, 2)}</pre>
      <strong>Código fuente:</strong>
      <pre>${funcion.toString()}</pre>
    `;
  });
  buttonsContainer.appendChild(btn);
});
