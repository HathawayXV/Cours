#include <iostream>

using namespace std;
float num1, num2, fnum;
char A;
int main()
{
    cout << " Number 1 ? " << endl;
    cin>>num1;
    cout<<" What operation want you make ? (addition [+], subtraction [-], multiplication [*], division [/])"<<endl;
    cin>>A;
    cout<<" Number 2 ? "<<endl;
    cin>>num2;
    switch(A){
    case '+':
        fnum=num1+num2;
        break;
    case '-':
        fnum=num1-num2;
        break;
    case '*':
        fnum=num1*num2;
        break;
    case '/':
        if(num2==0){
        cout<<" this operation hasn't anwser. "<<endl;
        return 0;
        }
        else{
            fnum=num1/num2;
            break;
        }
    default:
        break;
    }
    cout<<" the anwser is "<<fnum<<endl;
    return 0;
}
