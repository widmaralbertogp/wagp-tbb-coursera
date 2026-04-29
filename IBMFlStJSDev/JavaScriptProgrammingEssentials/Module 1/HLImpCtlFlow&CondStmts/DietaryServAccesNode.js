const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Bienvenido al Programa de Servicios Dietéticos.\nPor favor, indica tu rol (Employee, Enrolled Member, Subscriber, Non-Subscriber): ", function(role) {
  if (role) {
    role = role.trim().toLowerCase();

    switch (role) {
      case "employee":
        console.log("Acceso concedido: Estás autorizado para acceder a 'Dietary Services'.");
        break;
      case "enrolled member":
        console.log("Acceso concedido: Estás autorizado para acceder a 'Dietary Services' y tener interacción uno a uno con un dietista.");
        break;
      case "subscriber":
        console.log("Acceso concedido: Tienes acceso parcial a 'Dietary Services'.");
        break;
      case "non-subscriber":
        console.log("Acceso denegado: Debes inscribirte o suscribirte para acceder a 'Dietary Services'.");
        break;
      default:
        console.log("Rol no válido. Por favor, introduce un rol válido.");
    }
  } else {
    console.log("No se introdujo ningún rol.");
  }

  rl.close();
});
