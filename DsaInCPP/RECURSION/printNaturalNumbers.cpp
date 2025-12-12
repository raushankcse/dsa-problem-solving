#include<bits/stdc++.h>
using namespace std;

void natural(int n){
  if(n<=0){
    return;
  }
  natural(n-1);
  cout<<n<<endl;
}


int main(){
  int n;
  cin>>n;
  natural(n);
  return 0;
}