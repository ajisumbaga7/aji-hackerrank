#include <iostream>

using namespace std;

int fibonacci(int n) {
    // Complete the function.
    if(n==1 || n==2){
        return 1;
    }
    int bottom_up [n+1];
    bottom_up[0] = 0;
    bottom_up[1] = 1;
    bottom_up[2] = 1;
    for(int i = 3; i<n+1 ; i++ ){
        bottom_up[i] = bottom_up[i-1]+bottom_up[i-2];
    }
    // cout<<bottom_up;
    return bottom_up[n];
}

int main() {
    int n;
    cin >> n;
    cout << fibonacci(n);
    return 0;
}
