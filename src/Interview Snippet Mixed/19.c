#include<stdio.h>
int main()
{
    int i,j,k;
     k=1;
    for(i=0;i<=5;i+=2)
    {
        for(j=5;j>=1;j--)
        {
            if(j>i)
            printf("");
            else
            printf("%d",k++);
        }
    }
}