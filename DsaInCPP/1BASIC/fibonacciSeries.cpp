// print fibonacci series up to nth index...

#include<bits/stdc++.h>
using namespace std;

int main(){

  int n ;
  cin>>n;
  int firstTerm=0;
  int secondTerm=1;
  cout<<firstTerm<<" ";
  cout<<secondTerm<<" ";
  for(int i=2;i<n;i++){
    int nextTerm=firstTerm+secondTerm;
    firstTerm=secondTerm;
    secondTerm=nextTerm;
    cout<<nextTerm<<" ";
  }


  return 0;
}