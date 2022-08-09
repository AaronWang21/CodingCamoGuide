#include <iostream>
#include <vector>

using namespace std;
int main(){
    int sum = 0;
    int n;
    int t;
    cin >> n;
    vector<int> array(n);
    for(int i = 0; i < n; i++){
        cin >> t;
        if(array[t - 1] == 0){
            array[t - 1] = 1;
        }
    }
    for(int j = 0; j < n; j++){
        if(array[j] == 1){
            sum += 1;
        }
    }
    cout << sum;
}
