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
/* ------------------------------------------------------------ */
