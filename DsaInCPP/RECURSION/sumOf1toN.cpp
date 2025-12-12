// wap to print sum of 1 to n using recurions

#include<bits/stdc++.h>
using namespace std;

int sum(int n){

  // base case
  if(n==1){
    return 1;
  }

  // recursive funcion
  return n + sum(n-1);
}

int main(){
  int n;
  cin>>n;
  cout<<sum(n);
  return 0;
}