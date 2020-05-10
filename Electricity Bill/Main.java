#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  std::cin>>a;
  int res = 0;
  if(a<=200)
  {
  	  res = a * 0.5;
  }
  else if(a<=400)
  {
    res = a * 0.65 + 100;
  }
  else if(a<=600)
  {
    res = a * 0.8 + 200;
  }
  else
  {
    res = a * 1.25 + 425;
  }
  std::cout<<"Rs."<<res;
}