#include<iostream>

int main()
{
  int a;
  std::cin>>a;
  int x = 5;
  int t = 6;
  std::cout<<t<<" ";
  for(int i=1;i<a;i++)
  {
    t = t + x * i;
    std::cout<<t<<" ";
  }
}