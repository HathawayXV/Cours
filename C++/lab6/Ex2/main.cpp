#include <iostream>
#include "interval.h"

using namespace std;


int main()
{

    if (isInterval(0,0)){
        cout<<"my program's work"<<endl;
    }
    else {
        cout<<"ça marche pa"<<endl;
    }
    if (isInterval(5,3)){
        cout<<"my program's work"<<endl;
    }
    else {
        cout<<"ça marche pa"<<endl;
    }
    if (isInterval(3,5)){
        cout<<"my program's work"<<endl;
    }
    else {
        cout<<"ça marche pa"<<endl;
    }
    return 0;
}
