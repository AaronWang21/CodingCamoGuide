#include <iostream>
#include <algorithm>

using namespace std;

void method(int& a, int& b, int& c){
    if(a > b){
        swap(a, b);
        if(b > c){
            swap(a, c);
        }
    }
    if(b > c){
        swap(b, c);
        if(a > b){
            swap(a, b);
        }
    }
}

int main() {
    int a = 5, b = 7, c = 2;
    method(a, b, c);
    cout << a << b << c << endl;
}