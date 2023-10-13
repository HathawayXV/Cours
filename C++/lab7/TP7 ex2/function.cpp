#include <iostream>
#include <vector>
#include <stdlib.h>
#include <string>
#include <time.h>
#include "function.h"

using namespace std;

string randomWord(vector<string>dictionary){
    srand (time(NULL));
    int sizee = dictionary.size();
    int random = rand() % (sizee-1) + 0;
    return (dictionary[random]);
}

void displayRules(){
    cout<<"Hi there, let me remind you the rules : "<<endl;
    cout<<"- A random word will be selected"<<endl;
    cout<<"- You need to find it"<<endl;
    cout<<"- but you can do only 10 mistake"<<endl;
    cout<<"- And you can only use letter"<<endl;
    cout<<"- Good Luck soldier"<<endl;
    cout<<endl;
}

void displayCurrent(int i){
    cout<<"You have "<<i<<" try."<<endl;
    cout<<endl;
}

string starWord(string playerWord){
    int i;
    string s="";
    for(i=0;i<playerWord.size();i++){
        s+="*";
        }
    cout<<s<<endl;
    return s;
}

string requestLetter(string playerWord,string s, char letter){
    int i=0;
    while(i<playerWord.size()&& playerWord[i]!=letter){
        i++;
    }
    if (i<playerWord.size()){
        s[i]=letter;
    }
    return s;
}
