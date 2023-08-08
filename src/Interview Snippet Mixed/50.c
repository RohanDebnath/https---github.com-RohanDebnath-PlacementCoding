#include <stdio.h>
#define CUBE(x) x * x * x
void solve() {
    int ans = 216 / CUBE(3);
    printf("%d", ans);
}
int main() {
 //   solve();

   int i = 2;  
  {  
    int i = 4, j = 5;  
     printf("%d %d", i, j);  
  }    
  printf("%d %d", i, j);  
	return 0;
}