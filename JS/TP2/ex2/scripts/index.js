"use strict";

/* ------------------------------------------------------------ */
// let old = undefined;

let colonnes = [];
let lignes = [];

let contenu = undefined;

function table_to_mobile(){
    if (contenu === undefined) {
        fill();

        console.log(contenu);

        let table = document.querySelector("table");
        while (table.firstChild) {
            table.removeChild(table.firstChild);
        }

        for (let index = 0; index < contenu.lignes.length; index++) {

            for (let i = 0; i < contenu.colonnes.length; i++) {
                let newtr = document.createElement("tr");
                let newtd1 = document.createElement("td");
                let newtd2 = document.createElement("td");

                newtd1.textContent = contenu.colonnes[i];
                newtd2.textContent = contenu.lignes[index][i];
                newtd1.classList.add(getCouleur(i));

                newtr.appendChild(newtd1);
                newtr.appendChild(newtd2);
                table.appendChild(newtr);

                console.log(newtr);
            }
        }
    }
}

function table_to_desktop(){
    if(contenu !== undefined){
        let table = document.querySelector("table");
        while (table.firstChild) {
            table.removeChild(table.firstChild);
        }

        let thead = document.createElement("thead");
        let tbody = document.createElement("tbody");
        let tr = document.createElement("tr");

        for (let i = 0; i < contenu.colonnes.length; i++) {
            let td = document.createElement("td");
            td.textContent = contenu.colonnes[i];
            td.classList.add(getCouleur(i));
            tr.appendChild(td);
        }
        thead.appendChild(tr);

        for (let index = 0; index < contenu.lignes.length; index++) {
            let tr = document.createElement("tr");
            for (let i = 0; i < contenu.colonnes.length; i++) {
                let td = document.createElement("td");
                td.textContent = contenu.lignes[index][i];
                tr.appendChild(td);
            }
            tbody.appendChild(tr);
        }

        table.appendChild(thead);
        table.appendChild(tbody);

        contenu = undefined;
        colonnes = [];
        lignes = [];
    }
}

function fill(){
    let colonne = document.querySelector("table tr");
    let ligne = document.querySelectorAll("table tbody tr");
    for (const child of colonne.children) {
        colonnes.push(child.textContent);
    }
    ligne.forEach((un_tr) => {
        let une_ligne = [];
        for (const child of un_tr.children) {
            une_ligne.push(child.textContent);
        }
        lignes.push(une_ligne);
    });
    contenu = {
        colonnes: colonnes,
        lignes: lignes
    };
}

function getCouleur(value){
    switch (value) {
        case 0:
            return "A";
        case 1:
            return "B";
        case 2:
            return "C";
        case 3:
            return "D";
        case 4:
            return "E";
        default:
            return "";
    }
}

document.addEventListener("DOMContentLoaded", (event) => {
    let asc = document.querySelectorAll('table thead .asc');
    let desc = document.querySelectorAll('table thead .desc');
    asc.forEach(
        el => { el.addEventListener('click', trier ) }
    );
    desc.forEach(
        el => { el.addEventListener('click', trier ) }
    );
});

function trier(event) {
    fill();

    //pour l'exemple
    contenu.lignes = [
        ['1A', '2B', '3C', '4D', '5E'],
        ['2A', '3B', '4C', '5D', '6E'],
        ['3A', '4B', '5C', '6D', '7E'],
        ['4A', '5B', '6C', '7D', '1E'],
        ['5A', '6B', '7C', '1D', '2E'],
        ['6A', '7B', '1C', '2D', '3E'],
        ['7A', '1B', '2C', '3D', '4E']
    ];

    let temp = event.target.parentNode;
    let val = colonnes.indexOf("Col " + temp.classList[0]);

    console.log(contenu.lignes);

    if (event.target.classList.contains("asc")) {
        contenu.lignes.sort((l_a, l_b) => {
            if (l_a[val] < l_b[val]) {
                return -1;
            }

            if (l_a > l_b) {
                return 1;
            }

            return 0;
        });
    }
    else {
        contenu.lignes.sort((l_a, l_b) => {
            if (l_a[val] > l_b[val]) {
                return -1;
            }

            if (l_a < l_b) {
                return 1;
            }

            return 0;
        });
    }
    table_to_desktop();
}

function conversion(){
    
}

/* ------------------------------------------------------------ */
