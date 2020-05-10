#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int a[3];
  std::cin>>a[0]>>a[1]>>a[2];
  int n = sizeof(a)/sizeof(a[0]);
  sort(a,a+n);
  std::cout<<"The treasure is in box which has number "<<a[1]<<endl;
  int te = a[0];
  hes: ;
  for(int i=1;i<3;i++)
  {
    if(a[i]%te==0)
    {
      continue;
    }
    else
    {
      te--;
      goto hes;
    }
  }
  std::cout<<"The code to open the box is "<<te;
  
}