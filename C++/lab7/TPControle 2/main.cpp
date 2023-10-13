// exercice 3 pas reussi et exercice 5 et 6 manque de temps.
#include <iostream>
#include <vector>

using namespace std;

int classement;
//exercice 1
vector<string>chevaux = {"octave", "esquive", "bolero", "porcelaine"};
vector<int> rang;

int main()
{
    //exercice 2
    for(int i=0;i<chevaux.size();i++){
        cout<<chevaux[i];
        if(i!=chevaux.size()-1){
            cout<<", ";
        }
        else{
            cout<<endl;
        }
    }
    //exercice 4
    for(int i=0;i<chevaux.size();i++){
        int y=0;
        cout<<"quel est le rang de "<< chevaux[i]<<" ?"<<endl;
        cin>>classement;
        rang.push_back(classement);
        cout<<endl;
    }
    return 0;
}

/*
Jeu 1

Quel est le rang de Octave ?
3
Quel est le rang de Esquive ?
4
Quel est le rang de Bolero ?
2
Quel est le rang de Porcelaine ?
1

Saisis correct

Octave 3

Esquive 4

Bolero  2

Porcelaine 1

Jeu 2

Quel est le rang de Octave ?
2
Quel est le rang de Esquive ?
4
Quel est le rang de Bolero ?
3
Quel est le rang de Porcelaine ?
1

Saisis correct

Octave 2

Esquive 4

Bolero  3

Porcelaine 1

Jeu 3

Quel est le rang de Octave ?
1
Quel est le rang de Esquive ?
4
Quel est le rang de Bolero ?
3
Quel est le rang de Porcelaine ?
1

Saisis incorrect

Octave 1

Esquive 4

Bolero  3

Porcelaine

Porcelaine n'a pas de rang*/
