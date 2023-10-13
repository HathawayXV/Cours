#include <iostream>

using namespace std;
int chld, adlt, cost;
char dest;
const int ch_single_europe = 200, ch_group_europe = 0, adlt_single_europe = 400, adlt_group_europe = 200; //group and single rate Europe
const int ch_single_asia = 500, ch_group_asia = 300, adlt_single_asia = 1200, adlt_group_asia = 800; // group and single Asia
int main()
{
    cout <<" write the number of children "<< endl;
    cin>>chld;
    cout <<" write the number of adult "<< endl;
    cin>>adlt;
    cout <<" Witch country want you visite ?(Europe[e], Asia[a]) "<< endl;
    cin>>dest;
    dest = tolower(dest);
    if (adlt+chld>10){
        switch (dest);
        case 'e':
            cost = (ch_group_europe*chld) + (adlt_group_europe*adlt);
            break;
        case 'a':
            cost = (ch_group_asia*chld) + (adlt_group_asia*adlt);
            break;
    }
    else
    {
        switch (dest)
        case 'e':
            cost = (ch_single_europe*chld) + (adlt_single_asia*adlt);
            break;
        case 'a':
            cost = (ch_single_asia*chld) + (adlt_single_asia*adlt);
            break;
    }
    cout<<" that will you cost "<<cost<<" € "<<endl;
    return 0;
}
