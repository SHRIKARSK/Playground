#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[4];
  for(int i=0;i<4;i++)
  {
    std::cin>>a[i];
  }
  int res = a[0]+a[2];
  int re = a[1]+a[3];
  if(re>100)
  {
	res = res + re/100;
    re = re%100;
  }
  std::cout<<res<<"\n"<<re;
  
}