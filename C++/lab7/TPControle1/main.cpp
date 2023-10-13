#include <iostream>

using namespace std;
int val1, resultat, faute=1;
int main()
{
    //Question 1 Demander la table qu'il souhaite réviser
    cout << "Saisir une valeur (entre 1 inclus et 10 inclus)" << endl;
    cin>>val1;
    while(val1>10 || val1<1){
        cout << "Veuillez saisir une valeur correct ? (inclus ou egal a 1 et 10) ressayer "<< endl;
        cin>>val1;
    }
    //Question 3 S'il y a une faute ou plus, la table recommence
    while(faute>=1){
        faute=0;
        //Question 2 Révision de la table de multiplication
        for(int i=1;i<=10;i++){
        cout<<"Quelle est le resultat de : "<<val1<< " x "<<i<<" ?"<<endl;
        cin>>resultat;
        if(resultat==val1*i){
            cout << "OK"<< endl;
            cout<<endl;
        }
        else{
            cout<<"erreur la bonne reponse est : "<<val1*i<<endl;
            cout<<endl;
            faute++;
        }
    }
    if(faute>=1){
        cout<<"Vous avez eu : "<<faute<<" faute(s) ressayer"<<endl;
        cout<<endl;
    }
    }
    cout<<"felicitations"<<endl;
    return 0;
}
