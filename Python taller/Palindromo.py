def palindromo(palabra):
    return palabra == palabra[::-1]

palabra = input("Ingresa una palabra: ")
print(f"La palabra '{palabra}' es un palíndromo: {palindromo(palabra)}")
