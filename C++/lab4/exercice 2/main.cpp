#include <iostream>
#include<vector>

using namespace std;
const int stop = -999;
vector<float> myVector;
int i, taille;
float value;
string yes;
int main()
{
    cout << "add variables ?" << endl; //Ask question
    cin>>yes;
    if(yes=="yes"){
            cout<<"set value"<<endl;
            cin>>value; //set value
        while(value!=-999){
                myVector.push_back(value); //add a new value on the back of the vector
                taille=myVector.size();
                cout<<"set a new value"<<endl;
                cin>>value; //set value again
        }
    }
    if(taille==0){
        cout<<"you don't save any value"<<endl;
        return 0;
    }
    cout << "Your variables is :" << endl;
    for(i=0;i<taille;i++){ //show the vector
            cout<<myVector[i]<<" ";
            }
    return 0;
}
