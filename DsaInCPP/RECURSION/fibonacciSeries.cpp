// wap to print fibonacci series using recursion
#include<bits/stdc++.h>
using namespace std;

int fibonacciSeries(int n){
  if(n<=1){
    return n;
  }

  return fibonacciSeries(n-1)+fibonacciSeries(n-2);
}


int main(){
  int n;
  cin>>n;
  for(int i=0;i<n;i++){
    cout<<fibonacciSeries(i)<<" ";
  }
  return 0;
}