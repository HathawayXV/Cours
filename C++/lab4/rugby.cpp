/// JL 2022
/// Managing a sports team : the England women's national rugby union team
/// g++ -std=c++14

/// YOUR NAME HERE ...................................
/// YOUR GROUP NUMBER HERE ...................................

#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main( )
{
    vector<string> team = {"HARRISON","REED","HUNTER","HARPER","CORNBOROUGH","THOMPSON"};
    cout<<"the first element of the vector "<<team[0]<<endl;
    cout<<"the same element accused differently "<<team.front()<<endl;
    int i, len;
    len = team.size();
    for(i=0;i<len;i++){
        cout<<team[i]<<" ";
        cout<<endl;
    }
    cout<<endl;
    for(i=len-1;i>=0;i--){
        cout<<team[i]<<" ";
        cout<<endl;
    }
    cout<<endl;
    string name;
    string r;
    int x;
    cout<<"would you want add some player ? (yes, no)"<<endl;
    cin>>r;
    if(r=="yes"){
            cout<<"how many players"<<endl;
            cin>>i;
            for(x=0;x<i;x++){
                cout<<"What is his name ?"<<endl;
                cin>>name;
                team.push_back(name);
                cout<<name<<" Has been added"<<endl<<endl;
            }
            len = team.size();
            cout<<endl<<"Your new team size is : "<<endl<<endl;
            for(i=0;i<len;i++){
            cout<<team[i]<<" ";
            cout<<endl;
            }
        }
    cout<<"did you search someone? player ? (yes, no)"<<endl;
    cin>>r;
    if (r=="yes"){
        cout<<"what is his name ?"<<endl;
        cin>>name;
        i = 0;
        while(i<len && team[i]!=name){
            i++;
        }
    if (i<len){
        cout<<team[i]<<" is on the list, he/she is number :"<<i<<endl;
        cout<<"need to change ? "<<i<<" (yes, no)"<<endl;
        cin>>r;
        if(r=="yes"){
            cout<<"name ?"<<endl;
            cin>>team[i];
            cout<<team[i]<<" Has been added to :"<<i<<endl<<endl;
            cout<<endl<<"Your new team is : "<<endl<<endl;
            for(i=0;i<len;i++){
            cout<<team[i]<<" ";
            cout<<endl;
            }
        }
    }
    else {
        cout<<"no found"<<endl;
    }
    }
}
