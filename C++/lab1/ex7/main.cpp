#include <iostream> //Add the library
using namespace std;
float temp; //created a float variable
float avgtemp; //created a another float variable
int main() //initiated a new block called "main"
    {
    cout << "Give me 3 temperatures " << endl; //told the user to give us 3 temperatures
    cin>>temp; //print the value to temp
    avgtemp = temp; //avgtemp = to temp value
    cin>>temp; //print the new value to te temp
    avgtemp = avgtemp + temp; //new avg value = to last avg value + new temp
    cin>>temp; //replace the old temp to the new one
    avgtemp = (avgtemp + temp)/3; //avgtemp is equal to [(old avgtemp + temp)/3]. (3 because we have 3 temperatures)
    cout << "the average temperatures is :"<< avgtemp << endl; //print "the average temperatures is :" with the avgtemp value
    return 0;
    }//return
