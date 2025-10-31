import math

def calcular_area(radio, altura):

    return 2 * math.pi * radio * altura + 2 * math.pi * radio**2

radio = 40
altura = 10
print(calcular_area(radio, altura))  