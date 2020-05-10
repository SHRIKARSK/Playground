#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  std::cin>>a;
  int x = 2;
  int t = 6;
  for(int i=1;i<=a;i++)
  {
    if(i==1)
      std::cout<<"0 ";
    else
    {
      std::cout<<x<<" ";
      x = x + t;
      if(i%2!=0)
        t+=4;
    }
  } 
}