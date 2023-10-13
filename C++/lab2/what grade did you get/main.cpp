#include <iostream>

using namespace std;
int note;
int main()
{
    cout << " Note/20 ? " << endl;
    cin>>note;
    if(note>15){
        cout << " Congrats! " << endl;
    }
    else if (note<10) {
        cout << " Not good enough, just keep working hard! " << endl;
    }
    else {
        cout << " You got most of it right keep continue " << endl;
    }
    return 0;
}
