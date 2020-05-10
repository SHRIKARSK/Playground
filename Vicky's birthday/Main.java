#include<iostream>

int main()
{
  int a;
  std::cin>>a;
  if(a%400==0)
  {
 	std::printf("Vicky can celebrate his birthday.");
  }
  else if(a%4==0)
  {
    if(a%100!=0)
    {
      std::printf("Vicky can celebrate his birthday.");
    }
    else
    {
   		std::printf("Vicky can't celebrate.");
	}
  }
  else
  {
    std::printf("Vicky can't celebrate.");
  }
}
