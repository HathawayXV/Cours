"use strict";

/* ------------------------------------------------------------ */
function rajoute_un_clic() {
    var bouton = document.getElementById("btn");
    var valeur = parseInt(bouton.innerText);
    valeur++;
    bouton.innerText = valeur.toString();
}

function rajoute_un_clic_2(lui) {
    var bouton = lui;
    var valeur = parseInt(bouton.innerText);
    valeur++;
    bouton.innerText = valeur.toString();
}

document.addEventListener("DOMContentLoaded", (event) => {
    var tableau = document.querySelector('table');
    tableau.addEventListener("click", change_couleur);
});

function change_couleur(event) {
    const caseCliquee = event.target;
    const couleur = caseCliquee.innerText;
    const paragraphe = document.getElementById("txt");
    paragraphe.style.color = couleur;
}

/* ------------------------------------------------------------ */
