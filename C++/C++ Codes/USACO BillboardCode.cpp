/******************************************************************************
                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
#include <iostream>
#include <cmath>
#include <fstream>

using namespace std;
int main(){
        ifstream fin ("billboard.in");
        int r1x1, r1y1, r1x2, r1y2, r2x1, r2y1, r2x2, r2y2, r3x1, r3y1, r3x2, r3y2;
        fin >> r1x1 >> r1y1 >> r1x2 >> r1y2 >> r2x1 >> r2y1 >> r2x2 >> r2y2 >> r3x1 >> r3y1 >> r3x2 >> r3y2;
        int array[2001][2001] = {};
        int counter = 0;
        for(int i = r1x1 + 1000; i < r1x2 + 1000; i++){
            for(int j = r1y1 + 1000; j < r1y2 + 1000; j++){
                if(i >= r3x1 + 1000 && i < r3x2 + 1000 && j >= r3y1 + 1000 && j < r3y2 + 1000){
                    array[i][j] = 1;
                }
            }
        }
        for(int i = r2x1 + 1000; i < r2x2 + 1000; i++){
            for(int j = r2y1 + 1000; j < r2y2 + 1000; j++){
                if(i >= r3x1 + 1000 && i < r3x2 + 1000 && j >= r3y1 + 1000 && j < r3y2 + 1000){
                    array[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < 2001; i++){
            for(int j = 0; j < 2001; j++){
                if(array[i][j] == 1){
                    counter += 1;
                }
            }
        }
        int length1 = r1y2 - r1y1;
        int width1 = r1x2 - r1x1;
        int length2 = r2y2 - r2y1;
        int width2 = r2x2 - r2x1;
        int rectangle1 = length1 * width1;
        int rectangle2 = length2 * width2;
        ofstream fout ("billboard.out");
        fout << rectangle2 + rectangle1 - counter;
        return 0;
}