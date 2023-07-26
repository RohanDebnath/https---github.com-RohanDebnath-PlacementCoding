#include<stdio.h>
int main()
{
    int i=1,j;
    for(;;)
    {
        if(i)
        j=--i;
        if(j<5)
        {
            printf("%d",++j);
        }
        else
        {
            break;
        }
    }
}