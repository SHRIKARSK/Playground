#include<iostream>

int main()
{
  int a,b;
  std::cin>>a>>b;
  if(a>b)
  {
    std::printf("Yes, you can enter.");
  }
  else if(a==b)
  {
    std::printf("Yes, you can enter. Kindly use a rope.");
  }
  else
  {
    std::printf("Sorry, you can't enter");
  }
}