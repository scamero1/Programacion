def contador_vocales():
    cadena = input("Ingresa una cadena: ")
    vocales = 'aeiouAEIOU'
    contador = 0
    for letra in cadena:
        if letra in vocales:
            contador += 1
    print(f"El número de vocales en la cadena es: {contador}")

contador_vocales()
