#include <iostream>

using namespace std;

int main()
{
    cout << "Put variable n°1" << endl;
    int var1;
    cin>>var1;
    cout << "Put variable n°2" << endl;
    int var2;
    cin>>var2;
    int tempvar = var1;
    var1 = var2;
    var2 = tempvar;
    cout << "your variable n°1 is :"<<var1<<" and your variable n°2 is : "<< var2 << endl;

    return 0;
}
