#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time;
  std::cin>>age>>time;
  switch((int)time)
  {
    case 13:
    case 18:
    case 22:if(age>13)
    		{
      			std::cout<<"$5.00";
    		}else{
        		std::cout<<"$2.00";
      		}
      		break;
    default:if(age>13)
    		{
      			std::cout<<"$8.00";
    		}else{
        		std::cout<<"$4.00";
      		}
  	}
}