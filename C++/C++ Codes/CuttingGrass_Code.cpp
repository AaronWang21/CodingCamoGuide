/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;
int main()
{
    int t;
    int row1,row2,column1,column2;
    cin >> t;
    for(int i = 0; i < t; i++){
        cin >> row1 >> column2 >> row2 >> column1;
        if(row1 == 1 && row2 == 1 && column1 == 1 && column2 == 1){
            cout << "2\n";
        }
        else if(row1 == 1 && row2 == 1 || row1 == 1 && column1 == 1 || row1 == 1 && column2 == 1 || column1 == 1 && row2 == 1 || column2 == 1 && row2 == 1 || column1 == 1 && column2 == 1){
            cout <<  "1\n";
        }
        else if(row1 == 1 || row2 == 1 || column1 == 1 || column2 == 1){
            cout << "1\n";
        }
        else{
            cout << "0\n";
        }
    }
}
