// wap to print array using recurison

#include<bits/stdc++.h>
using namespace std;

void printArray(int arr[], int i, int n){
  if(i==n) return;
  cout<<arr[i]<<" ";
  printArray(arr, i+1, n);
}




int main(){
  int arr[]  = {2,3,4,7,8,9};
  int n = sizeof(arr)/sizeof(int);
  printArray(arr, 0,n);
  return 0;
}