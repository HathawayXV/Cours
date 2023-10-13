#include <iostream>

using namespace std;
int m, n, maxi, mini, total;

int main()
{
    cout << "Set a how many number do you set (<1)" << endl;
    cin>>n;
    while(n<0){
        cout << "Set a correct number" << endl;
        cin>>n;
    }
    n=n+1;
    cout << "Set a number "<<1<< endl;
    cin>>total;
    mini = maxi = total;
    for(int i=2;i<n;i++){
        cout << "Set a number "<<i<< endl;
        cin>>m;
        if(m>maxi){
            maxi = m;
        }
        if(m<mini){
            mini = m;
        }
        total = total + m;
    }
    cout << "Your number is "<<total<< endl;
    cout << "The largest value is "<<maxi<< endl;
    cout << "The smallest value is "<<mini<< endl;
    return 0;
}
