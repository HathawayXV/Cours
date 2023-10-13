#include <iostream>

using namespace std;
int n,a;

int main()
{
    cout<< "please enter two number" <<endl;
    cin>>n;
    cin>>a;
    a = n/a;
    if(a%2 == 0){
        cout <<a<< " is even" << endl;
    }
    else {
        cout <<a<< " your number is odd" << endl;
    }
    return 0;
}
