// script.js
document.addEventListener('DOMContentLoaded', () => {
    const container = document.getElementById('characters-container');

    fetch('https://rickandmortyapi.com/api/character')
        .then(response => {
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            return response.json();
        })
        .then(data => {
            data.results.forEach(character => {
                const card = document.createElement('div');
                card.classList.add('character-card');
                card.innerHTML = `
                    <img src="${character.image}" alt="${character.name}">
                    <h2>${character.name}</h2>
                    <p>Status: ${character.status}</p>
                    <p>Species: ${character.species}</p>
                `;
                container.appendChild(card);
            });
        })
        .catch(error => {
            container.innerHTML = `<p style="color: red;">Erreur: ${error.message}</p>`;
            console.error('Fetch error:', error);
        });
});