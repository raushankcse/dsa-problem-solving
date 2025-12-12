#include<bits/stdc++.h>
using namespace std;

void natural(int n){
  // base case
  if(n<=0){
    return;
  }


  // recursive function;;
  natural(n-1);

  // working
  cout<<n<<endl;
}


int main(){
  int n;
  cin>>n;
  natural(n);
  return 0;
}