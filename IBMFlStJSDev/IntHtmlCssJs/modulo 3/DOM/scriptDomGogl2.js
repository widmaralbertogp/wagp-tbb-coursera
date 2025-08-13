// 1. Crear elementos
const header = document.getElementById('header');
const main = document.getElementById('main');
const footer = document.getElementById('footer');

// 2. Crear menú
const menuData = [
  { text: 'Inicio', link: '#' },
  { text: 'Sección 1', link: '#seccion1' },
  { text: 'Sección 2', link: '#seccion2' },
  { text: 'Contacto', link: '#contacto' }
];

const createMenu = (data) => {
  const nav = document.createElement('nav');
  const ul = document.createElement('ul');
  data.forEach(item => {
    const li = document.createElement('li');
    const a = document.createElement('a');
    a.href = item.link;
    a.textContent = item.text;
    li.appendChild(a);
    ul.appendChild(li);
  });
  nav.appendChild(ul);
  return nav;
};

const menu = createMenu(menuData);
header.appendChild(menu);

// 3. Crear secciones y artículos
const createSection = (id, title, content) => {
  const section = document.createElement('section');
  section.id = id;
  const h2 = document.createElement('h2');
  h2.textContent = title;
  section.appendChild(h2);

  content.forEach(articleData => {
    const article = document.createElement('article');
    const h3 = document.createElement('h3');
    h3.textContent = articleData.title;
    const p = document.createElement('p');
    p.textContent = articleData.text;
    article.appendChild(h3);
    article.appendChild(p);
    section.appendChild(article);
  });
  return section;
};

const seccionesData = [
  { id: 'seccion1', title: 'Mi Primera Sección', content: [{ title: 'Artículo 1', text: 'Contenido del artículo 1.' }, { title: 'Artículo 2', text: 'Más contenido aquí.' }] },
  { id: 'seccion2', title: 'Mi Segunda Sección', content: [{ title: 'Artículo 3', text: 'Contenido del tercer artículo.' }] },
  { id: 'contacto', title: 'Contacto', content: [{title: 'Formulario', text: 'Formulario de contacto (a implementar)'}] }
];

seccionesData.forEach(seccion => {
  const sectionElement = createSection(seccion.id, seccion.title, seccion.content);
  main.appendChild(sectionElement);
});

// 4. Crear footer
const createFooter = (text) => {
  const p = document.createElement('p');
  p.textContent = text;
  return p;
};

const footerText = '© 2024 Mi Página Web. Todos los derechos reservados.';
const footerElement = createFooter(footerText);
footer.appendChild(footerElement);