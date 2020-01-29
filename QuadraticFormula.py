import math
a = float(input('A: '))
b = float(input('B: '))
c = float(input('C: '))
x = (b**2) - (4 * a * c)
squareRoot = math.sqrt(x)
x1 = (-b + squareRoot) / (2 * a)
x2 = (-b - squareRoot) / (2 * a)
print('X =', x1)
print('X =', x2)

