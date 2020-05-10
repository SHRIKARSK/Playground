#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  std::cin>>a;
  int cn = 0;
  while(a!=1)
  {
    cn++;
    if(a%2==0)
    {
      std::cout<<a<<"\n";
      a = a / 2;
    }
    else
    {
      std::cout<<a<<"\n";
      a = 3 * a + 1;
    }
  }
  std::cout<<"1"<<"\n"<<cn;
}