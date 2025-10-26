// Import Axios
const axios = require('axios');
// Make a GET request
async function fetchData() {
  try {
    const response = await axios.get('https://jsonplaceholder.typicode.com/posts');
    console.log('Response:', response.data);
  } catch (error) {
    console.error('Error:', error);
  }
}
fetchData();