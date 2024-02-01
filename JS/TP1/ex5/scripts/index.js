"use strict";

/* ------------------------------------------------------------ */
var abscisse = 0;
var ordonnee = 0;

document.addEventListener("DOMContentLoaded", (event) => {
    let tableau = document.querySelector('body');
    tableau.addEventListener("mouseup", changer_position);
});


function changer_position(event) {
    abscisse = event.mouvementX;
    ordonnee = event.mouvementY;
    console.log("x: " + abscisse + " y: " + ordonnee);
    
}
/*Mémorisé le début, puis détécter la fin puis calculer la distance*/
/* ------------------------------------------------------------ */
