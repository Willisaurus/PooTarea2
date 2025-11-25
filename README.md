# Programación Orientada a Objetos - Tarea Unidad 4
## Proyecto: Refactorización de Sistema Audiovisual

Este proyecto consiste en la refactorización integral de un sistema de gestión de contenidos audiovisuales (Películas, Series, Documentales, etc.). 

El objetivo principal fue transformar un código funcional pero monolítico ("código espagueti") en una arquitectura modular, mantenible y escalable, aplicando estándares profesionales de ingeniería de software:
* **Patrón MVC:** Separación de lógica, datos e interfaz.
* **Principios SOLID:** Para garantizar robustez y flexibilidad.
* **Persistencia de Datos:** Manejo de archivos CSV.
* **Calidad de Código:** Clean Code y Pruebas Unitarias.

---

### Arquitectura del Proyecto (MVC)
Se reestructuró el proyecto dividiéndolo en paquetes para respetar la separación de responsabilidades:

1.  **Modelo (`pruebaAudioVisualModelo`):** Clases POJO que representan los datos. Se eliminó toda lógica de impresión (`System.out.println`) de estas clases.
2.  **Vista (`pruebaAudiovisualVista`):** Encargada exclusivamente de la interacción con el usuario y la presentación de datos en consola.
3.  **Controlador (`pruebaAudioVisualControlador`):** Clase `ControladorProyecto` que coordina la comunicación entre el Modelo y la Vista, además de gestionar la carga/guardado de datos.

---

### Detalles Técnicos e Implementación

#### 1. Persistencia de Datos (Archivos CSV)
Se desarrolló la clase `GestionDeArchivos` (en el paquete `datos`). 
* **Tecnología:** Uso de `BufferedReader` y `BufferedWriter`.
* **Estrategia:** Se implementó un algoritmo de **lectura/escritura vertical**. Esto permite manejar listas complejas (como actores dentro de una película) escribiendo los objetos "hijos" en líneas consecutivas bajo el objeto "padre", facilitando la lectura y evitando errores de parseo.

#### 2. Principios SOLID Aplicados
* **SRP (Responsabilidad Única):** Cada clase tiene un propósito específico. `GestionDeArchivos` solo gestiona I/O, `VistaProyecto` solo imprime, y los Modelos solo guardan datos.
* **OCP (Abierto/Cerrado):** Se utilizó la clase abstracta `ContenidoAudiovisual`, permitiendo extender el sistema con nuevos tipos sin modificar la lógica base.
* **LSP (Sustitución de Liskov):** Las subclases (`Pelicula`, `Serie`) sustituyen a la clase padre en las listas del controlador sin romper la funcionalidad.
* **DIP (Inversión de Dependencias):** El controlador no crea sus datos iniciales internamente, sino que los recibe (inyecta) desde el `Main`, facilitando las pruebas y la flexibilidad.

#### 3. Pruebas Unitarias (Testing)
Se desarrolló una suite de pruebas con **JUnit** para validar la robustez del sistema:
* **Casos Felices:** Creación correcta de objetos y manipulación de listas.
* **Casos Límite:** Comportamiento ante listas vacías o datos nulos.
* **Robustez:** Verificación de que el sistema no falla si el archivo de datos (`datos.csv`) no existe (se crea uno nuevo automáticamente).

---

###  Instrucciones de Clonación y Ejecución

#### Opción A: Eclipse (Recomendado)
1.  Abra Eclipse e ir a `File` > `Import`.
2.  Seleccione `Git` > `Projects from Git (with smart import)`.
3.  Elija `Clone URI`.
4.  Pegue la URL del repositorio: https://github.com/Willisaurus/PooTarea4
5.  Siga los pasos (Next > Finish) y el proyecto estará listo para ejecutar.

#### Opción B: IntelliJ IDEA
1.  En la pantalla de inicio, seleccione `Get from VCS` (o `Clone Repository`).
2.  Pegue la URL del repositorio.
3.  Presione `Clone`. IntelliJ detectará automáticamente la configuración del proyecto.

#### Opción C: Manual (.zip)
1.  Descargue el archivo `.zip` desde el botón verde "Code" en GitHub.
2.  Descomprima la carpeta.
3.  Abra su IDE favorito y seleccione "Open Project" buscando la carpeta descomprimida.

---

### Capturas de Pantalla

**Ejecución del Programa:**
<img width="995" height="809" alt="image" src="https://github.com/user-attachments/assets/65ea781f-c9ce-4f48-9e48-c23145599aae" />
<img width="1092" height="774" alt="image" src="https://github.com/user-attachments/assets/65e8122b-f2ae-4116-8b38-8d9599fa7686" />


### Diagrama de Clases
La estructura final del proyecto refleja las relaciones entre el Controlador, el Gestor de Archivos y la jerarquía de Modelos:

<img width="3820" height="4114" alt="DiagramaDeClasesPruebaAudiovisualU4" src="https://github.com/user-attachments/assets/3b61219f-353c-4bce-9d6e-9e7fe24de408" />

