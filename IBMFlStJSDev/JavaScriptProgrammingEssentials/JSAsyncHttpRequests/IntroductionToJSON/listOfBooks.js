// Function to fetch and work with JSON data
function fetchBooks()
{
    //Fetch the json data form the  file
    fetch('listOfBooks.json')
    .then(response => response.json())
    .then(data => {
        // Data contains the JSON content
        console.log('List of Books:');
        data.forEach(book => {
            console.log(`Title: ${book.title}`);
            console.log(`Author: ${book.author}`);
            console.log(`Publication Year: ${book.publicationYear}`);
            console.log('-----------------------------------------');
        });
        // You can perform other operations with the json data here.
        })
        .catch(error => {
            console.error('Error fetching JSON data:', error);
        });
}
// Call the function to fetch and work with JSON data fetch and work with JSON data 
fetchBooks();