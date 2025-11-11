#include<bits/stdc++.h>
using namespace std;

class Arr{
  public:
    vector<int> add(int &num, int num2){
      num++;
      num2+=2;

      return {num, num2};
    }
  
};

int main(){
  Arr a;
  
  int num= 10;
  int num2=20;
  vector<int> arr =  a.add(num, num2);
  for(int a : arr){
    cout<<a<<endl;
  }
}