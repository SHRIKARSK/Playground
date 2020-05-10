#include<iostream>

int main()
{
  int a,b,c;
  std::cout<<"Enter first number : Enter second number : Menu"<<"\n";
  std::cout<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"<<"\n"<<"4.Division"<<"\n"<<"5.Remainder";
  std::cin>>a>>b>>c;
  int res = 0;
  switch(c)
  {
    default:res = 0;
      break;
    case 1:res = a + b;
      break;
    case 2:res = a - b;
      break;
    case 3:res = a * b;
      break;
    case 4:res = a / b;
      break;
    case 5:res = a % b;
      break;
  }
  if(c>5)
    std::printf("\nInvalid operation");
  else
    std::cout<<"\n"<<res;
}
      
      
  