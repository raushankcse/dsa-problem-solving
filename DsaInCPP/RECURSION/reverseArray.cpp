// reverse an array using recursion

#include<bits/stdc++.h>
using namespace std;

void reverse(int arr[], int l, int r){
  // base case
  if(l>=r){
    return;
  }
  // work
  swap(arr[l],arr[r]);
  // recurisve case
  reverse(arr, l+1, r-1);
}

void print(int arr[], int i, int n){
  // base case;
  if(i>n){
    return ;
  }
  // work
  cout<< arr[i] <<" ";
  // recursive case;
  print(arr, i+1, n);

}

int main(){
  int arr[] = {1,2,3,4,2};
  int l=0;
  int r= sizeof(arr)/sizeof(int);
  print(arr,l,r-1);
  cout<<endl;
  reverse(arr, l,r-1);
  
  print(arr,l,r-1);
  
}