import React from 'react';
import './EventPlanner.css'; // Import CSS file for styling
import Footer from './Footer'

const EventPlanner = () => {
    return (
        <div className="event-planner-container">
            <header>
                <h1>Welcome to Event Planner</h1>
            </header>
            {/* Sección para describir el propósito o visión general de la app */}
            <section className="description">
                {/* El contenido de la descripción va aquí */}
                <p>
                    Planifica y organiza tus eventos sin esfuerzo con Event Planner. Desde
                    fiestas de cumpleaños hasta reuniones corporativas, te tenemos cubierto.
                </p>
                {/* Botón principal de llamada a la acción */}
                <button className="get-started-button">Comenzar</button>
            </section>
            {/* Sección para listar o categorizar diferentes tipos de eventos */}
            <section className="events_categories">
                {/* El contenido de las categorías de eventos va aquí */}
                        <ul>
                    <h2>Social Events:</h2>
                    <li>Birthday parties</li>
                    <li>Anniversary celebrations</li>
                    <li>Wedding receptions</li>
                    <li>Baby showers</li>
                    <li>Graduation parties</li>
                    <li>Family reunions</li>
                </ul>
                {/* Entertainment-based event types */}
                <ul>
                    <h2>Entertainment Events:</h2>
                    <li>Concerts</li>
                    <li>Music festivals</li>
                    <li>Film screenings</li>
                    <li>Comedy shows</li>
                    <li>Art exhibitions</li>
                    <li>Cultural events</li>
                </ul>
                {/* Community-focused event types */}
                <ul>
                    <h2>Community Events:</h2>
                    <li>Fundraising events</li>
                    <li>Charity galas</li>
                    <li>Volunteer drives</li>
                    <li>Neighborhood block parties</li>
                    <li>Community festivals</li>
                    <li>Cultural celebrations</li>
                </ul>
            </section>
            {/* Sección para resaltar las características o funcionalidades de la app */}
            <section className="features">
                {/* El contenido de las características va aquí */}
                {/* Section heading */}
                <h2>Features</h2>
                {/* List of key platform features */}
                <ul>
                    <li>Easy event creation and management</li>
                    <li>Customizable event templates</li>
                    <li>Guest list management</li>
                    <li>Real-time collaboration</li>
                    <li>Reminders and notifications</li>
                </ul>
            </section>
            {/* Sección para mostrar opiniones de usuarios o testimonios */}
            <section className="testimonials">
                {/* El contenido de los testimonios va aquí */}
                {/* Section heading */}
                <h2>Testimonials</h2>
                {/* Individual testimonial block */}
                <div className="testimonial">
                    <p>"Event Planner made organizing my wedding a breeze. Highly recommended!"</p>
                    <p className="author">- Emily Johnson</p>
                </div>
                {/* Another testimonial block */}
                <div className="testimonial">
                    <p>"I use Event Planner for all my corporate events. It saves me so much time and effort!"</p>
                    <p className="author">- John Smith</p>
                </div>
            </section>
            {/* Sección para proporcionar información de contacto o un formulario de contacto */}
            <section className="contact">
                {/* El contenido de contacto va aquí */}
                 {/* Encabezado de la sección */}
                <h2>Contáctanos</h2>
                {/* Formulario de contacto */}
                <form>
                    {/* Campo de entrada para el nombre */}
                    <input type="text" placeholder="Nombre" />
                    {/* Campo de entrada para el correo electrónico */}
                    <input type="email" placeholder="Correo Electrónico" />
                    {/* Área de texto para el mensaje */}
                    <textarea placeholder="Mensaje"></textarea>
                    {/* Botón de enviar */}
                    <button className="submit-button">Enviar</button>
                </form>
            </section>
            
            <Footer/>
        </div>
    );
};

export default EventPlanner;
