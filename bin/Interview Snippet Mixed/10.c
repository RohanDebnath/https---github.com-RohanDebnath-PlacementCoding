#include<stdio.h>
int main()
{
    int a=26,b;
    int *ptr1,*ptr2;
    ptr1=&a;
    ptr2=&b;
    b=86;
    printf("%d %d ",*ptr1,*ptr2);

}