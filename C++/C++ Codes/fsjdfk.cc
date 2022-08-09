#include <bits/stdc++.h>

using namespace std;

void method(vector<int>& v){
    unordered_set<int> set;

    for(int i = 0; i < v.size(); i++){
        set.insert(v[i]);
    }

    for(int n : set){
        cout << n<< " ";
    }
}
int main(){
    vector<int> v{1, 2, 3, 4, 3, 2, 34, 4, 56, 34, 4, 5, 67};

    for(int n : v){
        cout << n<<" ";
    }
    
    cout << endl;
    method(v);
}