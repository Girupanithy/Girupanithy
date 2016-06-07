 #include <stdio.h>
    #include <stdlib.h>
    #include <string.h>
    int main()
    {
        char str[2];
        char str1[11];
        int value;
        int i,count=2,size;
        unsigned long int n;
        scanf("%lu",&n);
        sprintf(str1,"%lu",n);
        size=strlen(str1);
        char str2[size];
        strcpy(str2,str1);
        for(i=0;i<size;i++)
        {
            str[0]=str2[i];
            str[1]=str2[i+1];
            value=atoi(x);
            if((value>=10)&&(value<=25))
            {
                count++;
            }
        }
        printf("%d\n",count);
        return 0;
    }
