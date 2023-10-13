#include <iostream>
#include <string>
#include <stdexcept>
using namespace std;

float operation(char op, float a, float b);

int main() {
  char op; // requested operation
  float a,b;
  float res;
  a=4,b=0; // here we put different values for tests

try{
        op = '*'; //-- testing multiplication
        cout << a << op << b << endl;
        res =  operation(op,a,b);
        cout <<"resultat " << a << op << b <<"="<<res << endl;

        op = '+';  //-- testing addition
        cout << a << op << b << endl;
        res =  operation(op,a,b);
        cout <<"resultat " << a << op << b <<"="<<res << endl;

        op = '-';  //-- testing soustraction
        cout << a << op << b << endl;
        res =  operation(op,a,b);
        cout <<"resultat " << a << op << b <<"="<<res << endl;

        op = '/';  //-- testing division
        cout << a << op << b << endl;
        res =  operation(op,a,b);
        cout <<"resultat " << a << op << b <<"="<<res << endl;
}

 catch(int x){ //catch va récupérer la valeur de l'opération, et switch va adapter la réponse selon la valeur de x
      switch(x){
      case 1:
        cerr<<"division by zero impossible"<<endl;
        break;
      case 2:
        cerr<<"operation inconnue"<<endl;
        break;
      }
  }
  return 0;
}


float operation(char op, float a, float b)  {
  float res;
  switch(op){
  case '/':
    if (b==0) throw(1);
    res = a/b;
    break;
  case '+':
    res = a+b;
    break;
  case '*':
    res = a*b;
    break;
  case '-':
    res = a-b;
    break;
  default :
    throw(2);
  }
  return res;
}

