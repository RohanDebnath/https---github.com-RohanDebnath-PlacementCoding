#include<stdio.h>
struct Classroom
{
    int srudent[7];
};
int main()
{
    struct Classroom cr={20,13,25,19,61,34};
    int *ptr;
    ptr=(int*)&cr;
    printf("%d",*(ptr+4));
}
