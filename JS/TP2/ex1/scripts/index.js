"use strict";

/* ------------------------------------------------------------ */
// let old = undefined;

let colonnes = [];
let lignes = [];

let contenu = undefined;

function table_to_mobile(){
    if(contenu === undefined){
        let colonne = document.querySelector("table tr");
        let ligne = document.querySelectorAll("table tbody tr");
        // console.log(ligne);
        for (const child of colonne.children) {
            colonnes.push(child.textContent);
        }
        ligne.forEach((un_tr) => {
            let une_ligne = [];
            for (const child of un_tr.children) {
                lignes.push(child.textContent);
            }
            // lignes.push(une_ligne);
        });
        // console.log(colonnes);
        contenu = {
            colonnes: colonnes,
            lignes: lignes
        };

        console.log(contenu.colonnes);

        let table = document.querySelector("table");
        while (table.firstChild) {
            table.removeChild(table.firstChild);
        }

        let index2 = 0;
        for (let index = 0; index < contenu.lignes.length; index++) {
            if(index2 === contenu.colonnes.length){
                index2 = 0;
            }
            let newtr = document.createElement("tr");
            let newtd1 = document.createElement("td");
            let newtd2 = document.createElement("td");
            let val2 = document.createTextNode(contenu.colonnes[index2]);
            let val = document.createTextNode(contenu.lignes[index]);
            newtd1.classList.add(getCouleur(index2));
            newtd1.appendChild(val2);
            newtd2.appendChild(val);
            newtr.appendChild(newtd1);
            newtr.appendChild(newtd2);
            table.appendChild(newtr);
            index2++;
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
        contenu.colonnes.forEach((colonne) => {
            let td = document.createElement("td");
            td.classList.add(getCouleur(contenu.colonnes.indexOf(colonne)));
            td.textContent = colonne;
            thead.appendChild(td);
        });
        console.log(contenu.lignes.length);
        console.log(contenu.colonnes.length);
        let index = 1;
        tr = document.createElement("tr");
        while(index <= contenu.lignes.length){
            let td = document.createElement("td");
            td.textContent = contenu.lignes[index-1];
            tr.appendChild(td);
            if (index%5 === 0) {
                tbody.appendChild(tr);
                tr = document.createElement("tr");
            }
            index++;
        }
        table.appendChild(thead);
        table.appendChild(tbody);
        contenu = undefined;
        colonnes = [];
        lignes = [];
    }
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
/* ------------------------------------------------------------ */
