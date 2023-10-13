#include <iostream>

using namespace std;
void write(string, int, string = "Nadja",  int = 10);
void write(string, int, int = 10, string = "Dong");
int main()
{
    write ("Hello", 15, "Ibrahim", 23);
    write ("Bye", 15, "Celeste");
    write ("Hi", 15, 15);
    write ("Bye", 15);
    return 0;
}

void write(string ch1, int i1, string ch2, int i2){
   cout <<"In write 1: " << ch1 <<" "<< ch2 <<" "<< i1 <<" "<< i2 << endl;
}
void write (string ch1, int i1, int i2, string ch2){
   cout <<"In write 2: " << ch1 <<" "<< ch2 <<" "<< i1 <<" "<< i2 << endl;
}
