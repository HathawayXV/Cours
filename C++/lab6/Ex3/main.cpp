#include <iostream>
#include "interval.h"
#include "menu.h"

using namespace std;

int main()
{
    int n1, n2;
    switch (menu()){
        do {
            case 1:
                cout <<"Give me 2 number's"<< endl;
                cin>>n1>>n2;
                while (isInterval(n1, n2)==false){
                    cout<<"The interval is not correct, set again"<<endl;
                    cin>>n1>>n2;
                    }
                    cout<<endl;
                    break;
            case 2:
                cout <<"the sum of the sum(n1,n2)"<<endl;
                cout<<endl;
                break;
            case 3:
                line(n2);
                cout<<endl;
                break;
            case 4:
                rectangle1(n1,n2);
                cout<<endl;
                break;
            }
            while(menu()!=5);
        }
    return 0;
}
