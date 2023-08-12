#include <stdio.h>

int main()
{
    int arr[] = {9, 2, 3, 4, 5, 6};
    int *p = arr;
    int index=arr[0];
    printf("++*p: %d\n", ++*p); // Increments the value at arr[0], prints 2
    printf("*p++: %d\n", *p++); // Reads arr[0], then advances p to arr[1], prints 2
    printf("*++p: %d\n", *++p); // Advances p to arr[2], then reads arr[2], prints 3

    printf("%d\n",++index);
    printf("%d\n",index++);
    printf("%d\n",++index);

    return 0;
}