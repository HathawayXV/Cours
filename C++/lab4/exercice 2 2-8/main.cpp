#include <iostream>
#include <vector>
using namespace std;
vector<int> myVector={10,15,9};
int sizee, somme, imax, imin, i=0;
float average;
int main()
{
    sizee=myVector.size();
    cout << "the average value is :" << endl;
    for(i=0; i<=sizee;i++){
        somme=somme+myVector[i];
        if(myVector[i]>imax){
            imax=myVector[i];
        }
    }
    imin=imax;
    for(i=0; i<=sizee;i++){
        if(myVector[i]<imin){
            imin=myVector[i];
        }
    }
    average=somme/sizee;
    cout<<average<<endl;
    cout<<"size : "<<sizee<<endl;
    cout<<imin<<"  "<<imax<<endl;
    i=0;
    while(i<sizee && myVector[i]!=imax){
            i++;
    }
    if (i<sizee){
        cout<<myVector[i]<<" is the largest number is "<<imax<<" he/she is number :"<<i+1<<endl;
    }
    i=0;
    while(i<sizee && myVector[i]!=imin){
            i++;
    }
    if (i<sizee){
        cout<<myVector[i]<<" is the smallest number is "<<imin<<" he/she is number :"<<i+1<<endl;
    }
    return 0;
}
