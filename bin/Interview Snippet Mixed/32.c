#include<stdio.h>
int main()
{
    for(int r=1;r<=3;r++)
    {
        for(int c=1;c<=3;c++)
        {
            printf("%c",r+96);
        }
        printf("\n");
    }
}