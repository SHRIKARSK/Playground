#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  std::cin>>x;
  int a=0,b=1;
  if(x<3)
  {
    if(x==1)
      std::cout<<"0";
    else
      std::cout<<"1";
  }
  else
  {
    int t = 0;
    for(int i=2;i<x;i++)
  	{
      t = a;
      a = b;
      b = t + b;
    }
  }
  std::cout<<b;
}