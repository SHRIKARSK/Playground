#include <iostream>

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
	// Type your code here
  	long a;
  	std::cin>>a;
  	int res = 0;
    int s = co(a);
  	for(int i=0;i<s;i++)
    {
      int t = a%10;
      res = res*10 + t;
      a = a/10;
    }
  	std::cout<<res;
	return 0;
}