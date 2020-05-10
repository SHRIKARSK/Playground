#include<iostream>

int main()
{
  int a;
  std::cin>>a;
  float t = 0.5;
  std::cout<<t<<" ";
  for(int i=1;i<a;i++)
  {
    t = t * 3;
	std::cout<<t<<" ";
  }
}