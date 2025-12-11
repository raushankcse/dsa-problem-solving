#include<bits/stdc++.h>
using namespace std;

bool palindrome(string s, int i, int n){
  // base case
  if(i>=n/2){
    return true;
  }
  if(s[i]!=s[n-i-1]){
    return false;
  }

  //  recursive case
  return palindrome(s, i+1, n);
}


int main(){
  string s = "madam";
  int n = s.size();
  bool value = palindrome(s, 0, n);
  if(value){
    cout<<"palindrome"<<endl;
  }else{
    cout<<"not a palindrome"<<endl;
  }

  return 0;
}