/// HBM / CTB
/// 2D vectors, image compression
#include <vector>
#include <iostream>
#include <string>
using namespace std;

int main()
{
    vector< vector <unsigned char>> image    /// sample image : values can be changed for your test cases
    {
        {2,3,2,2},
        {2,2,2,2},
        {2,255,2,2},
        {255,2,2,2},
        {2,255,2,2}
    };
    vector<int>histo(256);
    int nbl,nbc, color, sizee, nbcolor;/// to store the number of lines and columns in the image
    nbc=image[0].size();
    nbl=image.size();
    sizee=histo.size();
    cout<<nbl<<" "<<nbc<<endl;
    /// Display the image
    for(int i=0;i<nbl;i++){
        for(int j=0;j<nbc;j++){
            cout<<(int)image[i][j]<<"\t";
            color=(int)image[i][j];
            histo[color]++;
        }
        cout<<endl;
    }
    cout<<endl;
    int backcolor;
    for(int i=0;i<sizee;i++){
        cout<<histo[i]<<"\t";
        if(histo[i]>0){
            nbcolor++;
            if(histo[i]>backcolor){
                backcolor=histo[i];
            }
        }
    }
    cout<<endl;
    cout<<"we have "<<nbcolor<<" different color, with "<<backcolor<<" has background color."<<endl;
    /// the vector type is char : it needs to be converted to int to get a decimal display
    /// Ex : cout << (int)image[0][0];
    int ind1,ind2;
    cout<<"Give me 2 indices, I will display the corresponding pixel (line and column)"<<endl;
    cin>>ind1>>ind2;
    while(ind1>nbl||ind2>nbc){
        cout<<"This Value is not include in our image please send again"<<endl;
        cin>>ind1>>ind2;
    }
    cout<<"the value corresponding at line "<<ind1<<" columns "<<ind2<< " is ";
    ind1--;
    ind2--;
    cout<<(int)image[ind1][ind2]<<endl;
    return 0;
}
