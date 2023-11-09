"""
    Ejemplo clases en Python
"""
from misclases import Hospital

if __name__ == "__main__":
    bandera = True
    lista_hospitales = []
    while bandera:
        nombre = input("Ingrese el nombre del hospital: ")
        numero_camas = input("Ingrese el número de camas del hospital: ")
        numero_camas = int(numero_camas)
        presupuesto = input("Ingrese el presupuesto del hospital: ")
        presupuesto = float(presupuesto)
        
        hospital = Hospital(nombre, numero_camas, presupuesto)
        lista_hospitales.append(hospital)

        salida = input("Desea salir?. Ingrese la letra (y): ")
        
        if salida == "y":
            bandera = False

    print("Lista de Hospitales")
    for i in lista_hospitales:
        print("%s" % i)

