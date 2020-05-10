#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i;
  float f;
  std::cin>>i>>f;
  float res = 0.0;
  if(i<4)
  {
    switch(i)
    {
      case 1:res = f * i;
        break;
      case 2:res = f * 1.5;
        break;
      case 3:res = f * 2;
        break;
    }
    std::printf("%.2f",res);
  }else
  {
    std::cout<<"Number of items is more";
  }
}