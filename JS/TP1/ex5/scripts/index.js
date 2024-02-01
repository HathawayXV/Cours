"use strict";

/* ------------------------------------------------------------ */
var abscisse = 0;
var ordonnee = 0;

document.addEventListener("DOMContentLoaded", (event) => {
    let tableau = document.querySelector('.ex5');
    tableau.addEventListener("mousemove", changer_position);
});

function changer_position(event) {
    if(event.buttons){
        console.log("in");
        abscisse = event.movementX;
        ordonnee = event.movementY;
        event.target.style.left = abscisse + "px";
        event.target.style.top = ordonnee + "px";
    }
    console.log("fin");
}

/*Mémorisé le début, puis détécter la fin puis calculer la distance*/
/* ------------------------------------------------------------ */
