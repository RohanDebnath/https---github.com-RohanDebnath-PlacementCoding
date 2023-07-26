#include<stdio.h>
int main()
{
    int k=1;
    int m[5][5]={0};
    for(int i=0;i<5;i++)
    {
        for(int j=i;j<=4;j++)
       {
        m[i][j]=k++;
       } 
    } 
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
       {
            if(m[i][j]==0)
            printf(" ");
            else
            printf("%d",m[i][j]);
       } 
       printf("\n");
    }
}