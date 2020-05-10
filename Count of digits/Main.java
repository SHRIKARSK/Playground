#include<iostream>
int main()
{
  // Type your code here
  int cn = 0;
  int a;
  std::cin>>a;
  do 
  {
    cn++;
    a = a / 10;
  }while(a>0);
  std::cout<<cn;
    
}