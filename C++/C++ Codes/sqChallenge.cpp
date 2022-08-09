#include <bits/stdc++.h>

using namespace std;

void printStack(stack<int>& s){
    stack<int> s2;
    while(!s.empty()){
        int i =  s.top();
        s.pop();
        cout << i << endl;
        s2.push(i);
    }
    while (!s2.empty()){
        int j = s2.top();
        s2.pop();
        s.push(j);
    }
}
void printQueue(queue<int>& q){
    queue<int> q2;
    while(!q.empty()){
        int i =  q.front();
        q.pop();
        cout << i << endl;
        q2.push(i);
    }
    while(!q2.empty()){
        int j = q2.front();
        q2.pop();
        q.push(j);
    }
}
int main(){
    stack<int> st;
    st.push(1);
    st.push(7);
    st.push(3);
    st.push(8);
    st.push(13);
    st.push(2);
    printStack(st);
    queue<int> q;
    q.push(1);
    q.push(7);
    q.push(3);
    q.push(8);
    q.push(13);
    q.push(2);
    printQueue(q);
}