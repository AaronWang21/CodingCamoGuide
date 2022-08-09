/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <cstring>

using namespace std;
int main()
{
    int t;
    string s;
    string s2 = "yes";
    cin >> t;
    for(int i = 0; i < t; i++){
        cin >> s;
        if(strcasecmp(s.c_str(), s2.c_str())){
            cout << "NO\n";
        }
        else{
            cout << "YES\n";
        }
    }
}
