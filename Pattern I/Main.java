#include<iostream>

int main()
{
  int a;
  std::cin>>a;
  int cn = 0;
  int i = 0;
  while(cn<8)
  {
    if(cn>4)
      i--;
    else if(cn==4)
      i = i;
    else
      i++;
    for(int j=0;j<i;j++)
    {
      std::cout<<a;
    }
    std::cout<<"\n";
    if(cn<3)
      a++;
    if(cn==4)
      a = a - 1;
    if(cn>4)
      a-=1;
    cn++;
  }
}