#include<bits/stdc++.h>
using namespace std;
/*
pattern sample

*
**
***
****
*****


*/


int main(){

  int star=1;
  int n;
  cin>>n;

  while (n>0)
  {
    /* code */
    // star
    int j=0;
    while (j<star)
    {
      /* code */
      cout<<"*";
      j++;

    }
    




    //  next row prep
    star++;
    n--;
    cout<<endl;


  }
  




  return 0;
}