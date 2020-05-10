#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int in;
  std::cin>>in;
  int ev=0,od=0;
  for(int i=0;i<sizeof(in);i++)
  {
	int temp = in%10;
    in = in/10;
    if(temp%2==0)
      ev+=temp;
    else
      od+=temp;
  }
  if(ev==od)
    std::cout<<"Yes";
  else
    std::cout<<"No";
      
}