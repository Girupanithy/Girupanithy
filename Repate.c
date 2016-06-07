#include <stdio.h>
#include<string.h>
int main()
{
    int num,i,j;
    scanf("%d",&num);
    int arr[num+1];
    int max=0;
    for(i=0;i<num;i++){
       scanf("%d",&a[i]);
       max=(max>arr[i])?max:arr[i];
    }
    int hash[max+1];
    for(i=0;i<max;i++){
        hash[i]=0;
    }
    for(i=0;i<num;i++){
        hash[arr[i]]++;
    }
    for(i=0;i<max;i++){
        if(hash[i]>1){
            printf("%d ",i);
            hash[i]=0;
        }
    }
    return 0;
}
