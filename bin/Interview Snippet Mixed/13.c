#include<stdio.h>
struct employee
{
    char *employee_name;
    int salary;
};
int main()
{
    struct employee e1, e2;
    e1.employee_name="Rohan";
    e2=e1;
    printf("%s %s",e1.employee_name,e2.employee_name);

}