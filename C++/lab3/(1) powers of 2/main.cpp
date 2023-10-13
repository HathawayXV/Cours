#include <iostream>

using namespace std;
int n;
int m = 1;
int main()
{
    cout << "2 to the power of ?" << endl;
    cin>>n;
    for(int i=1; i<=n ; i++){
            m = m*2;
    }
    cout<<"2 to the power of: "<<n<<" = "<<m<<endl;
    return 0;
}
