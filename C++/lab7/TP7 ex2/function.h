#ifndef FUNCTION_H_INCLUDED
#define FUNCTION_H_INCLUDED
#include <vector>
#include <string>
using namespace std;

string randomWord(vector<string>dictionary);
void displayRules();
void displayCurrent(int i);
string starWord(string playerWord);
string requestLetter(string playerWord,string s, char letter);

#endif // FUNCTION_H_INCLUDED
