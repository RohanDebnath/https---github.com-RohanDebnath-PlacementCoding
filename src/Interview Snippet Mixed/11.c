#include<stdio.h>
int main()
{
    char *ptr;
    char string[]="Learn C from Rohan Debnath Sir";
    ptr=string;
    ptr+=6;
    printf("%s",ptr);
    
}