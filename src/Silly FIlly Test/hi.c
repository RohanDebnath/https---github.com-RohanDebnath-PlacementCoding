#include<stdio.h>
int main()
{
    char *p="Deltax";
    char c;
    for (int i = 0; i < 3; i++)
    {
        c=*p++;
    }
    printf("%c",c);
}