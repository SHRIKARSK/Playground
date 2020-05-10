#include<iostream>

int main()
{
  int a,b;
  std::cin>>a>>b;
  int res = a + b;
  if(res == 6 || res == 28 || res == 496)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}
  