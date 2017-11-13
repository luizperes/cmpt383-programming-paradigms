#! /usr/bin/python
import sys

def add(a, b):
  for i in range(len(a)):
    for j in range(len(a[0])):
      c[i][j] = a[i][j] + b[i][j]
  return c

def multiply(a, b):
  for i in range(len(a)):
    for j in range(len(b[0])):
      for k in range(len(a[0])):
        c[i][j] += a[i][k] * b[k][j]
  return c

def custom(a, b):
  for i in range(len(a)):
    for j in range(len(a[0])):
      c[i][j] = (max(a[i][j], b[i][j]) +
                pow(a[i][j], 2)        +
                pow(b[i][j], 2))
  return c

num = int(sys.argv[1])
w, h = num, num
a = [[x * 2 for x in range(w)] for y in range(h)]
b = [[x * 2 for x in range(w)] for y in range(h)]
c = [[0 * 2 for x in range(w)] for y in range(h)]

c = add(a, b)
c = multiply(c, a)
c = custom(c, b)

print(c[0][0])
