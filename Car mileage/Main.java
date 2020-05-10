#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  std::cin>>x>>y>>z;
  if(x*y>=z)
  {
	std::printf("Can reach");
  }
  else
  {
    std::printf("Cannot reach");
  }
}