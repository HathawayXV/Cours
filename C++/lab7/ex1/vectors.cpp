#include <iostream>
#include <vector>
#include <string>
#include "vectors.h"

using namespace std;

void display(vector<string> team){
    cout << endl << endl << "Displaying in order " << endl ;
    for (int i=0 ; i<team.size() ; i++) {
        cout << team[i] << endl;
    }
}

string normalization(string player){
   int l=player.length();
        for (int j=0 ; j<l; j++)
            player[j]=toupper(player[j]);
        return(player);
}
