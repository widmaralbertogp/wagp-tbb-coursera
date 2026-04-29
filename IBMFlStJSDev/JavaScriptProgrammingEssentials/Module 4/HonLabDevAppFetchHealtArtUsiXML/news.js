var xhr = new XMLHttpRequest();

var url = './news.json';

xhr.open('GET', url, true);

xhr.responseType = 'json';

xhr.onload = function()
{
    var articles = xhr.response.articles;
    var articlesDiv = document.getElementById('articles');
    articles.forEach(function(article) {
      var articleDiv = document.createElement('div');
      articleDiv.classList.add('article');

      var title = document.createElement('h2');
      title.textContent = article.title;

      var author = document.createElement('p');
      author.textContent = article.author;

      var category = document.createElement('h3');
      category.textContent = article.category;

      var content = document.createElement('h3');
      content.textContent = article.content;

      articleDiv.appendChild(title);
      articleDiv.appendChild(author);
      articleDiv.appendChild(category);
      articleDiv.appendChild(content);      

      articlesDiv.appendChild(articleDiv);
    });
    var articleDiv = document.createElement('div');
    articleDiv.classList.add('article');
    articleDiv.appendChild(title);
}

xhr.send();