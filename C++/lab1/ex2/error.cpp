#include <iostream>
using namespace std;
const float PI=3.14;
float area;
int main(){
    float radius;
    cout << "What is the radius of the circle (in cm)?";
    cin >> radius;
    area=PI*radius*radius;
    cout << "Here is the area of your circle :" << area << endl;
    return 0;
}

