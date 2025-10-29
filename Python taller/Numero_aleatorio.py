import random

def num_aleatorio():
    num_aleatorio = random.randint(1, 100)
    print("Adivina un número entre 1 y 100")
    while True:
        num_ingresado = int(input("Ingresa un número: "))
        if num_ingresado < num_aleatorio:
            print("El número que ingresaste es menor que el número aleatorio")
        elif num_ingresado > num_aleatorio:
            print("El número que ingresaste es mayor que el número aleatorio")
        else:
            print("¡Felicitaciones, adivinaste el número!")
            break

num_aleatorio()
