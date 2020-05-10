#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  int temp;
  std::cin>>a;
  temp = a;
  int sum = 0;
  for(int i=0;i<sizeof(a);i++)
  {
   	 sum+=temp%10;
    temp/=10;
  }
  if(a%sum==0)
    std::cout<<"Harshad Number";
  else
	std::cout<<"Not Harshad Number";
}