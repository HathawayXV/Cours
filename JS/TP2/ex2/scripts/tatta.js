let xxx = 'titi';
let ttt = [ {'nom':'toto','prenom':'titi','age':6},   ];


function cherche(t,x,test){
    for (let i = 0; i < t.length; i++) {
        if(test(t[i],x)) {
            console.log("found");
        }
    }
}

function test_prenom(obj,val){
    return obj.prenom === val;  
}


function test_age(obj,val){
    return obj.age === val;  
}

cherche(ttt,xxx,test_prenom)
cherche(ttt,6,test_age)




Vous 19
Moi  02

Moi  19
Vous 02