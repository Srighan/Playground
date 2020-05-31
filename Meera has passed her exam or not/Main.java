#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int arr[n];
  for (int i=0;i<n;i++)
  {
    std::cin>>arr[i];
  }
  int meera,k = 0;
  std::cin>>meera;

  for(int j=0;j<n;j++)
  {
    
    if(arr[j]==meera){
       k = 1;
      
      break;
    }
    else{
      k = 0;
      continue;
    }
  }
  if (k)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}
       
  
      
    
    
  