#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int ball,run,rsc,bow;
  cin>>ball>>run>>rsc>>bow;
  std::cout<<(ball/6)<<endl;
  int q = (bow/6);
  int r = (bow%6);
  float res = q+r*0.1;
  std::printf("%.1f\n",res);
  float runrate = run/(ball/6.0);
  float cur = rsc/res;
  std::cout<< fixed << setprecision(1) << cur << "\n" << runrate << endl;
  if(cur>runrate)
  {
    std::printf("Eligible to Win");
  }
  else
  {
    std::printf("Not Eligible to Win");
  }
}