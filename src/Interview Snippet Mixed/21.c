#include<stdio.h>
int main()
{
    for(int i=1;i<=4;i++)
    {
       int k=i-1;
        for(int j=i;j<i+4;j++)
        {
            if(j<=4)
            printf("%d",j);
            else
            printf("%d",k--);
        }
        printf("\n");
    }
}