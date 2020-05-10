#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int year;
  cin>>year;
  if(year%4==0 || (year%100==0 && year%400==0))
  {
	std::printf("%d is a leap year",year);
  }
  else
  {
    std::printf("%d is not a leap year",year);
  }
}