const content = document.getElementById("content");
const body = document.body;


// Carga inicial (Home)
loadHome();

// Navegación
document.getElementById("homeLink").addEventListener("click", () => {
  changeBackground('bg-sao');
  loadHome();
});
document.getElementById("aboutLink").addEventListener("click", () => {
  changeBackground('bg-toronto');
  loadAbout();
});
document.getElementById("contactLink").addEventListener("click", () => {
  changeBackground('bg-sydney');
  loadContact();
});

// Cambiar fondo
function changeBackground(newClass) {
  body.className = newClass;
}

// Secciones dinámicas
function loadHome() {
  content.innerHTML = `
    <div class="section">
      <h1>Know Your Dream's Land</h1>
      <p>Explore iconic destinations across the globe — from São Paulo to Toronto, Sydney, London, and Lima.</p>
      <button class="booking-btn">Book Now</button>
    </div>`;
}

function loadAbout() {
  content.innerHTML = `
    <div class="section">
      <h2>About Our Company</h2>
      <p>We connect dreamers with their favorite destinations around the world.</p>
      <div class="team">
        <div class="card">
          <h3>Anna Smith</h3>
          <p>CEO & Founder</p>
        </div>
        <div class="card">
          <h3>John Miller</h3>
          <p>Travel Director</p>
        </div>
        <div class="card">
          <h3>Maria Lopez</h3>
          <p>Marketing Lead</p>
        </div>
      </div>
    </div>`;
}

function loadContact() {
  content.innerHTML = `
    <div class="section">
      <h2>Contact Us</h2>
      <form class="formcontacs">
        <input type="text" placeholder="Your Name" required />
        <input type="email" placeholder="Your Email" required />
        <textarea placeholder="Message" rows="4" required></textarea>
        <button type="submit">Send</button>
      </form>
    </div>`;
}

document.getElementById("search-btn").addEventListener("click", searchDestination);

function searchDestination() {
  const input = document.getElementById('inputDestin').value.toLowerCase();
  const resultDiv = document.getElementById('result');
  resultDiv.innerHTML = '';

  fetch('travel_recommendation_api.json')
    .then(response => response.json())
    .then(data => {
      let found = null;

      // Buscar en países y sus ciudades
      for (const country of data.countries) {
        const city = country.cities.find(c => c.name.toLowerCase().includes(input));
        if (city) {
          found = city;
          break;
        }
      }

      if (!found) found = data.temples.find(t => t.name.toLowerCase().includes(input));
      if (!found) found = data.beaches.find(b => b.name.toLowerCase().includes(input));

      if (found) {
        resultDiv.innerHTML = `
          <div class="card" id="result-card">
            <img src="${found.imageUrl}" alt="${found.name}">
            <h2>${found.name}</h2>
            <p>${found.description}</p>
          </div>
        `;

        const card = document.getElementById("result-card");

        // Ocultar al salir con el mouse
        card.addEventListener("mouseleave", () => hideCardSmooth(card));

        // Ocultar al perder el foco del input
        const inputEl = document.getElementById("inputDestin");
        inputEl.addEventListener("blur", () => hideCardSmooth(card));
      } else {
        resultDiv.innerHTML = '<p>No destination found.</p>';
      }
    })
    .catch(error => {
      console.error('Error:', error);
      resultDiv.innerHTML = '<p>An error occurred while fetching data.</p>';
    });
}

// Animación suave para cerrar la tarjeta
function hideCardSmooth(card) {
  if (!card) return;
  card.style.transition = "opacity 0.4s ease, transform 0.4s ease";
  card.style.opacity = "0";
  card.style.transform = "scale(0.95)";
  setTimeout(() => card.remove(), 400);
}
