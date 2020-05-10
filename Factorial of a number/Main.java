#include<iostream>
int main(){
  // Type your code here
  int a;
  std::cin>>a;
  int fact = 1;
  for(int i=a;i>1;i--)
  {
    fact = fact * i;
  }
  std::cout<<fact;
}