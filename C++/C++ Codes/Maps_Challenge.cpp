#include <iostream>
#include <unordered_map>

using namespace std;

int main(){
    unordered_map<char, int> ump;
    string s;
    getline(cin, s);

    for(char c : s){
        ump[c]++; 
    }
    
    for(auto it = ump.begin(); it != ump.end(); it++){
        cout << it -> first << " " << it -> second << endl;
    }
}