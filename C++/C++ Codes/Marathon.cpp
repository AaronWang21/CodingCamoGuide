#include <iostream>
 
using namespace std;
 
int main()
{
    int diff = 'a' - 'A';

    int n;
    int b, c, d;
    cin.tie(nullptr)->sync_with_stdio(false);
    cin >> n;
    for(int i = 0; i < n; i++){
        int target;
        int counter = 0;
        cin >> target >> b >> c >> d;
        if(b > target){
            counter++;
        }
        if(c > target){
            counter++;
        }
        if(d > target){
            counter++;
        }
        cout << counter << "\n";
    }
    return 0;
}