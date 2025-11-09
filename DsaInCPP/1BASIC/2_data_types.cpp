#include<iostream>
#include<string>
using namespace std;

int BasicDataType(string s) {
        // code here
        
        if(!isdigit(s[0]) and s[0]!='.'){
            return sizeof(char);
        }else if(s.find('.')==string::npos){
            return sizeof(int);
        }else{
            return (s.length()-s.find('.')-1)<6?sizeof(float):sizeof(double);
        }
        
        
}


int main(){

  return 0;
}