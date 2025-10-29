def calcular_media(lista):
    print(f"La media de la lista es: {sum(lista) / len(lista)}")

lista = [float(x) for x in input("Ingresa una lista de números separados por espacio: ").split()]
calcular_media(lista)
