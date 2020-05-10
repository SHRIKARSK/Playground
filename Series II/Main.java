#include<iostream>

int main()
{
  int a;
  std::cin>>a;
  int x = 121,y = 104;
  std::cout<<x<<" ";
  for(int i=0;i<a-1;i++)
  {
    std::cout<<x+y<<" ";
    x = x + y;
    y = y + 32;
  }
}