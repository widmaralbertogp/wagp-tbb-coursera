function showweatherDetails(event)
{
    const city = document.getElementById('city').value;
    const apiKey = 'c4f86ece00bc8aa272652ac9065af12d'; // Reemplaza 'YOUR_API_KEY' con tu clave API real
    const apiUrl = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric`;

    event.preventDefault();
    fetch(apiUrl)
    .then(response => response.json())
    .then(data => {
    const weatherInfo = document.getElementById('weatherInfo');
    weatherInfo.innerHTML = `<h2>Weather in ${data.name}</h2>
                            <p>Temperature: ${data.main.temp} &#8451;</p>
                            <p>Weather: ${data.weather[0].description}</p>`;
})

.catch(error => {
    console.error('Error fetching weather:', error);
    const weatherInfo = document.getElementById('weatherInfo');
    weatherInfo.innerHTML = `<p>Failed to fetch weather. Please try again.</p>`;
});
}
document.getElementById('weatherForm').addEventListener('submit',showweatherDetails );