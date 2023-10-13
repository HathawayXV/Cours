// HB/CB november 2022 - version for students
// License class, to handle drivers licenses
// license.cpp file
#include <string>
#include <iostream>
#include <stdexcept>
#include "license.h"

using namespace std;


// constructeur vide
License::License()
{
    cout << "Construction of a license" << endl;
    _name = "unknown";
    _firstName = "unknown";
    _date = "unknown";
    _number = "00000";
    _nbpoints = MAXP;
}


// constructor
License::License(string name, string firstName, string date, string number, int points)
{
    try{
        if(points>MAXP || points<MINP) throw invalid_argument("You already have invalid numbers of points"); //6
        cout << "Construction of a license" << endl;
        _name = name;
        _firstName = firstName;
        _date = date;
        _number = number;
        _nbpoints = points;
    }
    catch(const invalid_argument){
          cout<<"your number of points are invalid please try again"<<endl;
    };
}

// display of a license
void License::display() const
{
    cout << "Information concerning the license of " << _firstName << " "<< _name << " :" << endl;
    cout << _number << endl;
    cout << _date << endl;
    cout << "Number of points : "<< _nbpoints << endl;
}

// number of points
int License::getNbpoints() const
{
    return _nbpoints;
}

// withdrawal of points
void License::withdrawPoints(int nbPointsWithdrawn)
{
    if (_nbpoints < MINP + nbPointsWithdrawn)
    {
        _nbpoints = MINP;
    }
    else
    {
        _nbpoints -= nbPointsWithdrawn;
    }
}

//get a name
string License::GetName()const{
    return _name;
}

//incrementPoints
void License::incrementPoints(){
    int p=_nbpoints;
    try{
        if(p>=MAXP)throw invalid_argument("You already have max point (12)");
        p++;
        _nbpoints=p;
    }
    catch(const invalid_argument){
        cout<<"You already have max point (12)"<<endl;
    };
}

// decrementPoints
void License::decrementPoints(){
    int p=_nbpoints;
    try{
        if(p<=MINP)throw invalid_argument("You don't have enough point you are poor");
        p--;
        _nbpoints=p;
    }
    catch(const invalid_argument){
        cout<<"You don't have enough point you are poor"<<endl;
    };
}

// addpoint
void License::addPoints(License&, int x){
    if(_nbpoints+x>=MAXP){
        cout<<"to much point"<<endl;
        _nbpoints=12;
    }
    else{
        _nbpoints=x+_nbpoints;
    }
}

//5/destruction
License::~License() {
  cout << "Destruction of the license" << endl;
}

bool License::compare(const License& license){ //8
    return _nbpoints == license.getNbpoints();
}

//9


