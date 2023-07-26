#include<stdio.h>
int func(int , int);
int main()
{
    int a=25,b=24+1,c;
    printf("%d",func(a,b));
}
int func(int x, int y)
{
    return (x-(x==y));
}