//Factorial of n!
#include <iostream>

using namespace std;
int nfac; //integer 2 variables, nfac, m = 1
int m = 1;
int main()
{
    cout << "Factorial of ?" << endl; //show "factorial of"
    cin>>nfac; //set the value to nfac
    for(int i = 1; i<= nfac; i++){ //for i = 1 while i <= nfac do i + 1 and do
        m=m*i; //m = m*i
    }
    cout<<"factorial  "<<nfac<<" = "<<m<<endl; //show the result.
    return 0;
}

//test for factorial 5 = 120
//test for factorial 7 = 5040
//test for factorial 3 = 6
