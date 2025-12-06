# Proyecto de Herencia y Polimorfismo en Java: Componentes Vehiculares

Este proyecto es una demostración práctica de los principios de la Programación Orientada a Objetos (POO) en Java, específicamente la **herencia** y el **polimorfismo**, a través de un sistema de componentes de vehículos.

## Conceptos Clave

El código ilustra dos conceptos fundamentales de la POO:

1.  **Herencia**: Se define una clase base `ComponenteVehicular` que agrupa los atributos y métodos comunes a todos los componentes (como `codigo` y `fabricante`). Las clases específicas (`Motor`, `Transmision`, etc.) heredan de esta clase base, reutilizando código y extendiendo la funcionalidad.
2.  **Polimorfismo (Sobrescritura de Métodos)**: La clase base tiene un método `mostrarInformacion()`. Cada subclase sobrescribe este método para mostrar su información específica, además de la información heredada. Esto permite tratar a todos los objetos de componentes de manera uniforme, pero obtener un comportamiento específico de cada uno.

## Estructura de Clases

El proyecto está organizado con la siguiente jerarquía de clases:

### `ComponenteVehicular` (Clase Base)
Es la clase padre que define las características fundamentales compartidas por todos los componentes.
- **Atributos**: `codigo`, `fabricante`.
- **Métodos**: `mostrarInformacion()`.

### Subclases
Cada una de estas clases extiende a `ComponenteVehicular` y añade sus propios atributos y métodos.

-   **`Motor`**: Representa el motor del vehículo.
-   **`Transmision`**: Modela el sistema de transmisión.
-   **`Neumatico`**: Representa una llanta.
-   **`Chasis`**: Modela la estructura base del vehículo.
-   **`SistemaFrenos`**: Representa los frenos.

## Uso

La clase `Main.java` contiene el método `main`, que sirve como punto de entrada para la aplicación. En este método:
1.  Se crean instancias (objetos) de cada componente vehicular (`Motor`, `Transmision`, etc.).
2.  Se invoca al método `mostrarInformacion()` de cada objeto para demostrar el polimorfismo. El método invocado corresponde al de la clase específica del objeto, mostrando así la información detallada de cada componente.
3.  Se llaman a métodos propios de cada subclase para simular su funcionamiento particular.

## Cómo Compilar y Ejecutar

Puedes compilar y ejecutar el proyecto desde la línea de comandos. Asegúrate de tener el JDK de Java instalado.

1.  **Navega al directorio `src`**:
    ```sh
    cd src
    ```

2.  **Compila todos los archivos `.java`** y guarda los `.class` en el directorio `bin`:
    ```sh
    javac -d ../bin ./*.java
    ```

3.  **Vuelve al directorio raíz y ejecuta la clase `Main`**:
    ```sh
    cd ..
    java -cp bin Main
    ```

Tras la ejecución, verás en la consola la información detallada de cada componente vehicular que fue creado en el programa.
