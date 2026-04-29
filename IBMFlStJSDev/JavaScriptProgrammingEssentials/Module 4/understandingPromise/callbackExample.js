// This is the ONE EXAMPLE

//Access and display user with callbacks recent posts from an Api
// Simulated API request with callbacks
function gertUserInfo(userId, callback) {
    setTimeout(() => {
        const userInfo = {name: 'John', email:'john@example.com'};
        callback(userInfo);
    }, 1000);
}

function gertUserPosts(userId, callback){
    setTimeout(() => {
        const posts = ['Post 1','Post 2','Post 3'];
        callback(posts);
    }, 1500);
}

// Callback hell scenario
gertUserInfo(1, (userInfo) => {console.log('User info:', userInfo);
    gertUserPosts(1, (userPosts) => {console.log('User Posts:', userPosts);
        //Display user info and posts on the web page
        //This is where you would typically updater the ui
    });
});