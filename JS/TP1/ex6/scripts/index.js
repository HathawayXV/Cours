"use strict";

/* ------------------------------------------------------------ */
document.addEventListener("DOMContentLoaded", (event) => {
    let element = document.querySelector('table');
    element.addEventListener("click", changement);
});

function changement(event) {
    let image = document.querySelector('#etoile');
    let parentElement = event.target;
    parentElement.appendChild(image);
}
/* ------------------------------------------------------------ */
