// This is the SECOND EXAMPLE

// Simulated API request with Promise
function getUserInfo(userId) {
    return new Promise((resolve) => {
        setTimeout(() => {
            const userInfo = {name: 'John', email: 'john@example.com'};
            resolve(userInfo);
        }, 1000);
    });
}

function getUserPosts(userId) {
    return new Promise((resolve) => {
        setTimeout(() => {
            const posts = ['Post 1','Post 2','Post 3'];
            resolve(posts);
        }, 1500);
    });
}
// Using Promise to simplify the code

getUserInfo(1)
    .then((userInfo) => {
        console.log('User Info:', userInfo);
        return getUserPosts(1);
    })
    .then((userPosts) => {
        console.log('User Posts:', userPosts);
    })
    .catch((error) => {
        console.error('An error ocurred:', error);        
});