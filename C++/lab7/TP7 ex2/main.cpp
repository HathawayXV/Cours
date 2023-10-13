#include <iostream>
#include <vector>
#include <string>
#include "function.h"
//HAMED BEN AROUS
//YANNICK HAN

using namespace std;
char letter;
string s="";
int i = 10;
vector<string> dictionary = {"ALGORITHM", "VARIABLE", "FUNCTION", "PROGRAM", "DEFINITION", "DECLARATION", "CONDITION", "ANAGRAM", "ALGEBRA", "VARIATION", "DIFFERENT", "BOOLEAN", "BOWLING"};
string playerWord;

int main()
{
    displayRules();
    playerWord = randomWord(dictionary);
    s = starWord(playerWord);
    while(i>0 || playerWord==s){
        displayCurrent(i);
        cout<<"set a letter"<<endl;
        cin>>letter;
        s = requestLetter(playerWord, s, letter);
        cout<<s<<endl;
        i--;
    }
    return 0;
}
