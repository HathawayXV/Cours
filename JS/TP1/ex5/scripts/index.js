"use strict";

/* ------------------------------------------------------------ */
var abscisse = 0;
var ordonnee = 0;

document.addEventListener("DOMContentLoaded", (event) => {
    let tableau = document.querySelector('body');
    tableau.addEventListener("mousemove", changer_position);
    tableau.addEventListener("mouseup", changement);
});

function changement(event) {
    let element = document.querySelector('.ex5');
    element.style.left = abscisse + "px";
    element.style.top = ordonnee + "px";
    console.log("fermé");
    console.log(abscisse, ordonnee);
}

function changer_position(event) {
    if(event.buttons === 1){
        console.log("in");
        abscisse += event.movementX;
        ordonnee += event.movementY;
        console.log(abscisse, ordonnee);
    }
}

/*Mémorisé le début, puis détécter la fin puis calculer la distance*/
/* ------------------------------------------------------------ */
