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
    int x;
    int a, b, c;
    cin >> t;
    for(int i = 0; i < t; i++){
        cin >> x;
        cin >> a >> b >> c;
        int key = 0;
        if(1 == x){
            key = a;
            if(key == 2){
                key = b;
                if(key == 3){
                    cout << "YES\n";
                }
                else{
                    cout << "NO\n";
                }
            }
            else if(key == 3){
                key = c;
                if(key == 2){
                    cout << "YES\n";
                }
                else{
                    cout << "NO\n";
                }
            }
            else{
                cout << "NO\n";
            }
        }
        else if(2 == x){
            key = b;
            if(key == 1){
                key = a;
                if(key == 3){
                    cout << "YES\n";
                }
                else{
                    cout << "NO\n";
                }
            }
            else if(3 == key){
                key = c;
                if(key == 1){
                    cout << "YES\n";
                }
                else{
                    cout << "NO\n";
                }
            }
            else{
                cout << "NO\n";
            }
        }
        else if(3 == x){
            key = c;
            if(key == 2){
                key = b;
                if(key == 1){
                    cout << "YES\n";
                }
                else{
                    cout << "NO\n";
                }
            }
            else if(key == 1){
                key = a;
                if(key == 2){
                    cout << "YES\n";
                }
                else{
                    cout << "NO\n";
                }
            }
            else{
                cout << "NO\n";
            }
        }
        else{
            cout << "NO\n";
        }
    }
}