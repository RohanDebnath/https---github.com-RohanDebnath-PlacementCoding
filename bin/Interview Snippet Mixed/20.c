#include<stdio.h>
int main()
{
    for(int i=1;i<=5;i++)
    {
        for (int j = 5; j >= i; j--)
        {
            if(i<=3)
            printf("%d",i);
            else
            printf("%d",6-i);
        }
        printf("\n");
        
    }
}