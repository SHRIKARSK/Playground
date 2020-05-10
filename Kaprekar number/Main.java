#include<iostream>
#include<cmath>
using namespace std;

int co(long long n) 
{ 
    int count = 0; 
    while (n != 0) { 
        n = n / 10; 
        ++count; 
    } 
    return count; 
} 
int main()
{
  //Type your code here.
  int a;
  std::cin>>a;
  int sq = pow(a,2);
  int res;
  if(co(sq)%2==0)
  {
    int t = pow(10,co(sq)/2);
    int x = sq%t;
    int y = sq/t;
    res = x + y;
  }
  else
  {
    int t = pow(10,co(sq)/2+1);
    int x = sq%t;
    int y = sq/t;
    res = x + y;
  }
  //std::cout<<res;
  if(res == a)
    std::cout<<"Kaprekar Number";
  else
    std::cout<<"Not a Kaprekar Number";
}