"use strict";

/* ------------------------------------------------------------ */
function rajoute_un_clic() {
    let bouton = document.getElementById("btn");
    let valeur = parseInt(bouton.innerText);
    valeur++;
    bouton.innerText = valeur.toString();
}

function rajoute_un_clic_2(lui) {
    let bouton = lui;
    let valeur = parseInt(bouton.innerText);
    valeur++;
    bouton.innerText = valeur.toString();
}

document.addEventListener("DOMContentLoaded", (event) => {
    let tableau = document.querySelector('table');
    tableau.addEventListener("click", change_couleur);
});

function change_couleur(event) {
    const caseCliquee = event.target;
    const couleur = caseCliquee.innerText;
    const paragraphe = document.getElementById("txt");
    paragraphe.style.color = couleur;
}

function ajouter_deux_couleurs() {
    let inputs = document.querySelectorAll('input');
    inputs.forEach(element => {
        let couleur = element.value;
        let textNode = document.createTextNode(couleur);
        let td = document.createElement('td');
        let button = document.createElement('button');
        button.appendChild(textNode);
        button.style.backgroundColor = couleur;
        button.innerText = couleur;
        td.appendChild(button);
        var tableau = document.querySelector('table');
        tableau.appendChild(td);
    });
}

function check_sous_chaine(element) {
    console.log("try");
    let exemple = document.querySelectorAll('#exemple');
    let test = false;
    exemple.forEach(val => {
        test = test || val.innerText.includes(element.value);
        if (test) {
            val.innerHTML = val.innerText.replace(element.value, "<span style='background-color: yellow;'>" + element.value + "</span>");
        }
    });
    if (test) {
        element.setCustomValidity("");
    }
    else {
        element.setCustomValidity("invalid");
    }
}

/* ------------------------------------------------------------ */
