#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;
int rando; //integer rando, x, i=-1,re;
int x;
int i = -1;
int re;

int main()
{
    srand(time(0)); // initialize the random number generator using the current time
    rando=rand() %100 + 1; // generate a random number between 1 and 100

    cout << "Guess the number" << endl; //show "guess the number"
    cin>>x; //set x
    while (x!=rando && i!=10){ //while x is different to rando and i different to 10 do
        if(x>rando){ //is x lower than rando
            cout << "The number is lower" << endl; //show "the number is lower"
        }
        else{
            cout << "The number is higher" << endl; //show "the number is higher"
        }
        i=i+1; //add 1 to i
        re=10-i; //do 10 - i for the remaining test.
        cout <<re<<" test remaining..." << endl; //show the test remaining number
        cin>>x; //Set x again
    }
    if(x!=rando){ //if rando is different to the anwser
            cout << "You missed! the number i think about is : "<<rando<< endl; //show the awnser
            return 0;
        }
    cout << "exact, the number i was thinking about is :"<<rando<<" nice job"<<endl; //show the anwser
    return 0;
}
