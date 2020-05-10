#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int a[9];
  int i=0;
  for(i=0;i<9;i++)
  {
	std::cin>>a[i];
  }
  int ar[3];
  int j;
  for(i=0,j=0;i<3;i++)
  {
    ar[i] = a[j]-a[j]*a[j+1]/100 + a[j+2];
    j+=3;
  }
  std::cout<<"In Flipkart Rs."<<ar[0]<<endl;
  std::cout<<"In Snapdeal Rs."<<ar[1]<<endl;
  std::cout<<"In Amazon Rs."<<ar[2]<<endl;
  int aa = ar[0];
  int b = ar[1];
  int c = ar[2];
  
  if(aa<b && aa<c || (aa==b && aa<c))
  {
    std::cout<<"He will prefer Flipkart";
  }
  else if(b<aa && b<c)
  {
	std::cout<<"He will prefer Snapdeal";
  }
  else
  {
    std::cout<<"He will prefer Amazon";
  }
  
}