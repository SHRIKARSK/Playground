#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float res = 0.0;
  int cn = 0;
  while(1)
  {
    if(cn<3)
    {
    	std::cin>>a;
    	if(a<0)
    	{
      		res = res - 1.0;
      		break;
    	}
    	else
    	{
      		if(a%2!=0)
      		{
        		cn++;
            	res = res + 1;
        	}
        	else
        	{
            	res = res - 0.5;
            }
        }
    }else
      break;
  }
  std::printf("%.1f",res);
}