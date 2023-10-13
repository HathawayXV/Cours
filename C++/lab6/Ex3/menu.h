/// HBM. CTB october 2020
#ifndef MENU_H_
#define MENU_H

const int INTERVAL = 1;
const int SUM = 2;
const int LINE = 3;
const int RECTANGLE = 4;
const int QUIT = 5;

/// Display a list of options and return the user's choice, after verifying that it is valid
int menu();

/// Return true if the choice ranges between INTERVAL and QUIT
bool validChoice(int option);

#endif
