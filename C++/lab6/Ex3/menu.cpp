/// HBM. CTB october 2022
/// To display a menu and input the user's choice, checking that it is correct.
#include <iostream>
#include "menu.h"

using namespace std;

/// Check that the choice ranges between INTERVAL and QUIT (2 constants defined in the .h file).
bool validChoice(int choice)
{
    return (choice >= INTERVAL && choice <= QUIT);
}


/// Display a list of options and return the user's choice, after verifying that it is valid.
int menu()
{
    int	choice;

    cout << "Input" << endl;
    cout << INTERVAL << " to input a number and verify that it is in the interval." << endl;
    cout << SUM << " to compute the sum of the numbers within the interval." << endl;
    cout << LINE << " to display a line of stars." << endl;
    cout << RECTANGLE << " to display a rectangle of stars." << endl;
    cout << QUIT << " to quit the program." << endl;

    cin >> choice;

    while (!validChoice(choice))
    {
        cout << choice << " is not a valid option." << endl;
        cout << "Input a new value." << endl;
        cin >> choice;
    }

    return choice;
}

