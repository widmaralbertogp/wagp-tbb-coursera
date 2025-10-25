// Access HTML elements
const alertButton = document.getElementById('alertBtn');
const openWindowsBtn = document.getElementById('openWindowsBtn');
const navigateBackBtn = document.getElementById('navegateBackBtn');
const changeURL = document.getElementById('changeUrlBtn');

// Attach event listeners 
alertButton.addEventListener('click', () => {
    window.alert('Hello, this is an alert!');
});

// Attach event listeners 
openWindowsBtn.addEventListener('click', () => {
    window.open('http://www.uc.edu.ve', '_black');
});


// Attach event listeners 
navigateBackBtn.addEventListener('click', () => {
    history.back(); //Navigate back one page in the user's browsing history
});

// Attach event listeners 
changeURL.addEventListener('click', () => {
    location.href = 'http://www.uc.edu.ve';
});
