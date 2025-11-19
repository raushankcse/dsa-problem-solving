#include<bits/stdc++.h>
using namespace std;
int main(){
  long long int n;
  cin>>n;
  int count=0;
  while(n>0){
    int rem = n%10;
    if( rem!=0 && rem!=8 && ( rem%4==0 || rem%7==0)){

      count++;
    }
    n/=10;
  }


  if(count == 4 || count==7){
    cout<<"YES"<<endl;
  }else{
    cout<<"NO"<<endl;
  }



  return 0;
}