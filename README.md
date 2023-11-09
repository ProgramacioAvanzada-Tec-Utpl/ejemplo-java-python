# Ejemplo - Java - Python

El repositorio es de ámbito académico:

### Características
* Contiene un ejemplo en lenguaje de programación **Java**, en la carpeta **ejemplo-java**.
  * Se usó un proyecto en el IDE Netbeans para su creación.
* Contiene un ejemplo en lenguaje de programación **Python** en la carpeta **ejemplo-python**.

### Uso

* El repositorio se lo puede:
  * Descargar en **.zip**
  * Realizar un **fork** al repositorio y luego **clonar** en el entorno local

### Ejecución
* El proyecto del lenguaje Java, se lo debe ejecutar desde Netbeans, a través de la clases **Ejecutable.java**

```java
public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        ArrayList<Hospital> hospitales = new ArrayList<>();
        String nombre;
        int numeroCamas;
        double presupuesto;
        boolean bandera = true;
        String salida;
        while (bandera) {
            System.out.println("Ingrese nombre del hospital");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el número de camas del hospital");
            numeroCamas = entrada.nextInt();
            System.out.println("Ingrese el presuesto del hospital");
            presupuesto = entrada.nextDouble();
            entrada.nextLine();
            Hospital hospital = new Hospital(nombre, numeroCamas,
                    presupuesto);
            hospitales.add(hospital);
            System.out.println("Desea salir del ciclo?, escriba (y) ");
            salida = entrada.nextLine();
            if (salida.equals("y")) {
                bandera = false;
            }
        }

        System.out.println("Listado de Hospitales");
        for (int i = 0; i < hospitales.size(); i++) {
            System.out.printf("%s\n", hospitales.get(i));
        }


    }
}

```

* El proyecto del lenguaje Python, se lo puede ejecutar desde el **CMD/Símbolo del Sistemas/Terminal**, mediante el script **ejecutor.py**

```python

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

```

### Licencia
Distributed under the MIT License. See LICENSE for more information.

### Contacto
@reroes
