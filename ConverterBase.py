def convertir_base(nombre, base_depart, base_arriver):
    nombre_decimal = int(nombre, base_depart)
    nombre_binaire = ""
    if base_arrivee == 2:
        nombre_converti = bin(nombre_decimal)
    elif base arrivee == 10:
        nombre_converti = str(nombre_decimal)
    elif base_arrivee == 16:
        nombre_converti = hex(nombre_decimal)
    else:
        print("Base d'arrivée n'est pas correcte")
        return
    return nombre_converti

nombre = input("Entrez le nombre à convertir : ")
base_depart = int(input("Entrez la base de départ donc (2 pour binaire, 10 pour décimal, 16 pour hexadécimal) : "))
base_arrivee = int(input("Entrez la base d'arrivée donc (2 pour binaire, 10 pour décimal, 16 pour hexadécimal) : "))
nombre_converti = convertir_base(nombre, base_depart, base_arrivee)
print("Le nombre qui est converti est :", nombre_converti)
