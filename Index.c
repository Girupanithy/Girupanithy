#include<stdio.h>
#include<stdlib.h>
int main()
{
  long int size,i;
	scanf("%d",&size);
	int arr[size];
	for(i=0;i<size;i++){
	 scanf("%d",&arr[i]);
	 if(i==arr[i])
	 printf("%d equals to its index %d\n",arr[i],i);
	}
	return 0;
}
