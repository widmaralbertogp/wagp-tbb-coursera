const texto = document.createTextNode('localStorage is supported in this browser!');
const texto2 = document.createTextNode('Sorry, localStorage is not supported in this browser.');

// Check if the browser supports localStorage
function isLocalStorageSupported() 
{
  try {
    const testKey = '__test__';
    localStorage.setItem(testKey, testKey);
    localStorage.removeItem(testKey);
    return true;
  } catch (e) {
    return false;
  }
}
if (isLocalStorageSupported()) 
{
    document.body.appendChild(texto);
} 
else 
{
    document.body.appendChild(texto2);    
}