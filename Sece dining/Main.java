#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char s[5];
  int a;
  std::cin>>s;
  std::cin>>a;
  char f[] = "front";
  char r[] = "rear";
  if((a==1 && !strcmp(s,r))||(a==0 && !strcmp(s,f)))
  {
    std::printf("Right Handed");
  }
  else
  {
    std::printf("Left Handed");
  }
}