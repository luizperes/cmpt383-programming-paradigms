#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#define MAX(a,b) (((a)>(b))?(a):(b))

void add(int** a, int** b, int** c, int s)
{
  for (int i = 0; i < s; i++)
    for (int j = 0; j < s; j++)
      c[i][j] = a[i][j] + b[i][j];
}

void multiply(int** a, int** b, int** c, int s)
{
  for(int i = 0; i < s; i++)
    for (int j = 0; j < s; j++)
      for (int k = 0; k < s; k++)
        c[i][j] += a[i][k] * b[k][j];
}

void custom(int** a, int** b, int** c, int s)
{
  for(int i = 0; i < s; i++)
    for (int j = 0; j < s; j++)
      c[i][j] = MAX(a[i][j], b[i][j]) +
                (int)pow(a[i][j], 2)  +
                (int)pow(b[i][j], 2);
}

int main(int argc, char** argv)
{
  int n = atoi(argv[1]);
  int **a = (int**) malloc(n*n*sizeof(int));
  int **b = (int**) malloc(n*n*sizeof(int));
  int **c = (int**) malloc(n*n*sizeof(int));

  for (int i = 0; i < n; i++) {
    a[i][i] = i*2;
    b[i][i] = i;
  }

  add(a, b, c, n);
  multiply(a, b, c, n);
  custom(a, b, c, n);

  printf("%d\n", c[0][0]);

  return 0;
}
