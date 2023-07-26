#include<stdio.h>
int main()
{
    int a=97;
    char *ptr;
    ptr=(char*)&a;
    printf("%c",*ptr);
}