#include<bits/stdc++.h>

using namespace std;
int main(){

  vector<int> arr = {1,2,3,4,56,78,99};
  for(vector<int>::reverse_iterator it = arr.rbegin(); it!=arr.rend();it++){
    cout<<*it<<" ";
  }

  cout<<endl;
  
  return 0;
}