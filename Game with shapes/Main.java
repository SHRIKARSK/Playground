#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,l;
  cin>>r>>l;
  if(r<=(l/2))
  {
    std::printf("circle can be inside a square");
  }
  else
  {
	std::printf("circle cannot be inside a square");
  }
}