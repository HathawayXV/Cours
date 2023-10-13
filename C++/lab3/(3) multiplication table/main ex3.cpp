#include <iostream>

using namespace std;
int x; //integer x and y
int y;
const int tblmax=11; //constant integer tblmax = 11
int main()
{
    cout<<'\t'<<'\t'; // space 2 Times
    for (x=1;x<tblmax;x++){ //for x<tblmax add 1 to x
        cout<<x<<'\t'; //show x with a space
    }
    cout<<endl;
    cout<<"----------";

    for (x=1;x<tblmax;x++){ //for x<tblmax do x + 1 and do
        cout<<"--------";
    }
    cout<<endl;
    for (x=1;x<tblmax;x++){ //for x<tblmax do x+1 and do
        cout<<x<<'\t'<<'|'<<'\t'; //show x and space two time and between these space add "|"
        for (y=1;y<tblmax;y++){ //for y<tblmax do y + 1 and do
            cout<<x*y<<'\t'; //show how make x*y with a space a the end
        }
        cout<<endl;
    }
}
