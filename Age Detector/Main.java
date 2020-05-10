#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  std::cin>>x>>y;
  if(x>y)
  	y = y + 100;
  std::cout<<(y-x);
}