#include <iostream>
#include "interval.h"

using namespace std;

bool isInterval(int a, int b){
    return(a<b);
}

int sum(int n1, int n2){
    int sum1;
    sum1 = n1;
    for(int i=n1+1;i<=n2;i++){
        sum1=sum1+i;
    }
    return(sum1);
}

void line(int n2){
    for(int i=0;i<n2;i++){
        cout<<"*";
    }
    cout<<endl;
}

void emptyline(int n1){
    cout<<"*";
    for(int i=1;i<n1;i++){
        cout<<" ";
    }
    cout<<"*";
}

void rectangle1(int n1, int n2){
    line(n2);
    for(int i=0;i<n1-2;i++){
        emptyline(n2-1);
        cout<<endl;
    }
    line(n2);
}
