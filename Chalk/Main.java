#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  std::cin>>a;
  float sq = sqrt(a);
  int res = a + a / sq;
  /*while(res/sq>sq)
  {
    res = res + res/sq;
  }*/
  std::cout<<res+1;
}