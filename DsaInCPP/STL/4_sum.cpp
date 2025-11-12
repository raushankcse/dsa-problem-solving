#include<bits/stdc++.h>
using namespace std;

int main(){

  vector<int> arr = {12,3,4,57,9};

  int sum=0;
  for(int i=0;i<arr.size();i++){
    sum+=arr[i];
  }

  cout<<sum;


  return 0;
}