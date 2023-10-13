// HB/CB november 2022 - version for students
// License class, to handle drivers licenses
// main.cpp i
#include <string>
#include <iostream>
#include <vector>
#include "license.h"

using namespace std;

vector<
int main()
{
    License pdef;
    License p("Duck", "Donald", "09/06/1934", "012345", 7);
    License p1("Margot", "Robbit", "11/09/2001", "987654", 0);
    License p2("Holland", "Tom", "30/04/1945", "548645", 0);
    License p3("Miller", "Mac", "30/04/1945", "548645", 13);

    cout << endl << "----- Manual tests for display -----------------------------------------" << endl;
    pdef.display();
    p.display();
    //p2.decrementPoints();
    p2.display();
    //cout<<"your name is "<<p.GetName()<<endl;
    //p1.incrementPoints();
    p1.display();
    /*int point;
    cout<<"set point"<<endl;
    cin>>point;
    p2.addPoints(p1, point);*/
    p2.display();
    //p1.~License();
    cout<<p1.compare(p2)<<endl;

    cout << endl << "----- Automatic tests for getNbpoints --------------------------------" << endl;
    bool ok = true;
    if (!(p.getNbpoints() == 7))
    {
        ok = false;
        cout << "Error : p.getNbpoints() = " << p.getNbpoints() << " (expected : 7)" << endl;
    }
    if (ok) cout << "Method getNbpoints correct" << endl;

    cout << endl << "----- Automatic tests for withdrawPoints ------------------------------" << endl;
    ok = true;
    p.withdrawPoints(3);
    if (!(p.getNbpoints() == 4))
    {
        ok = false;
        cout << "Error : after having retrieved 3 points from a license with 7 points, we get a license with "
        << p.getNbpoints() << " points (expected : 4)" << endl;
    }
    p = License ("Duck", "Donald", "09/06/1934", "012345", 7);
    p.withdrawPoints(0);
    if (!(p.getNbpoints() == 7))
    {
        ok = false;
        cout << "Error : after having retrieved 0 points from a license with 7 points, we get a license with "
        << p.getNbpoints() << " points (expected : 7)" << endl;
    }
    p = License ("Duck", "Donald", "09/06/1934", "012345", 7);
    p.withdrawPoints(7);
    if (!(p.getNbpoints() == 0))
    {
        ok = false;
        cout << "Error : after having retrieved 7 points from a license with 7 points, we get a license with "
        << p.getNbpoints() << " points (expected : 0)" << endl;
    }
    p = License ("Duck", "Donald", "09/06/1934", "012345", 7);
    p.withdrawPoints(10);
    if (!(p.getNbpoints() == 0))
    {
        ok = false;
        cout << "Error : after having retrieved 10 points from a license with 7 points, we get a license with "
        << p.getNbpoints() << " points (expected : 0)" << endl;
    }
    p = License ("Duck", "Donald", "09/06/1934", "012345", 7);
    if (ok) cout << "Method withdrawPoints correct" << endl;

    //---------------------get name--------------------------
    p.GetName();

    return 0;
}

/* 1/
    a) The "license.h" file contain the class license and all the properties and function of license class, also we have declared 2 const integer "maxp and minp".
    b) The "license.cpp" contain all the methods in the public part. the "License::" tells compiler a method is a member of license class. if we remove this they will display than some function are not declared.
    c) The "main.cpp" have the mission to start and display all the function in the class
    d) They display all the lisence.cpp and main.cpp function

   2/
    b) "no match for 'operator<<'" so we have this because this because we can't display class with "cout".
    c) we can't display _name because he is private.
    d) target object does not changing

   4/
    b) "no declaration matches for this subprograms"

   5/
    b) I guess they destroy every time after a construction of a profile, we have 4 profiles, in the test we construct 4 profiles and destroy it after displaying

   7/
    a) I have error "p1 is not declared in this scope"

   8/
    a)


*/
