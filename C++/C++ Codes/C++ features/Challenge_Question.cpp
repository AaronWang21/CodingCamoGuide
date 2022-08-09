#include <bits/stdc++.h>

using namespace std;
int main(){
    int t, c, b, a, d;
    vector <tuple<int, int, int, int>> v;
    cout << "Input: \n";
    cin >> t;

    for(int i = 0; i < t; i++){
        cin >> a >> b >> c >> d;
        tuple <int, int, int, int> t{a, b, c, d}; 
        v.push_back(make_tuple(a, b, c, d));
    }

    sort(v.begin(), v.end());
    cout << "Output: \n";
    
    for(int i = 0; i < t; i++){
        cout << get<0>(v[i])<< " " << get<1> (v[i])<< " " << get<2> (v[i])<< " " << get<3> (v[i])<< " " << endl;
    }
}