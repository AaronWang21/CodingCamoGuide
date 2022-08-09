#include <fstream>
#include <algorithm>
using namespace std;
 
int main(){
    ofstream fout("mixmilk.out");
    ifstream fin("mixmilk.in");
    int a, b, c, sizea, sizeb, sizec;
    fin >> sizea >> a >> sizeb >> b >> sizec >> c;
    for(int i = 0; i < 100; i++){
        if(b + a <= sizeb){
            b += a;
            a = 0;   
        } else {
            a -= (sizeb - b);
            b = sizeb;
        }
        swap(a, b);
        swap(c, b);
        swap(sizea, sizeb);
        swap(sizeb, sizec);
    }
    fout << c << "\n";
    fout << a << "\n";
    fout << b << "\n";
    return 0;
}