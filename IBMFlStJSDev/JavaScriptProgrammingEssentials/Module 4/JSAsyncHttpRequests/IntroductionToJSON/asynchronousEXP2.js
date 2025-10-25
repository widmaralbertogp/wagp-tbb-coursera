function simulateAsyncOperation(callback){
        setTimeout(function () {
            callback("Data from a simulated asynchronous operation");
        },2000); // Simulate a 2-second delay
    }

console.log("Start of the program");
simulateAsyncOperation(function (data) { 
    console.log("Data received: ", data);
    console.log("End of the program");
});
console.log("Asynchronous operation in progress...");