// Import the Axios library
const axios = require('axios');

//Define the API url
const apiUrl = 'https://jsonplaceholder.typicode.com/posts/1';

// Make a GET request
axios({
    method: 'GET',
    url: apiUrl
})
.then(response => {
        //Handle the successful response
    console.log('Data freom the API:', response.data);
})
.catch(error => {
        // Handle error
    console.log('An error occured:', error);
});