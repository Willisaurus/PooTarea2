Programación Orienta a Objetos - Tarea Unidad 2
Proyecto - Prueba Audiovisual
Objetivos del proyecto
Crear un app para obtener información de diferentes tipos de contenidos audiovisuales.
Poner en practica los conceptos de herencia, polimorfismo, abstraccion, encapsulamiento
y las relaciones entre clases (Asociacion, Agregacion, Composicion).
Se agregaron 6 nuevas clases, las tres priemras clases fueron propuestas por el docente, estas
tuvieron el propósito de poner en práctica las relaciones entre clases. Las nuevas clases, Actor
e Investigador presentaron una relación de agregación con las clases Pelicula y Documental. Mientras
que la clase Temporada cumplío con una relación de composición con la clase SerieDeTV.

Posteriormente se agregaron 3 clases nuevas propuestas por el estudiante, 2 clases heredadas de 
ContenidoAudiovisual y una clase extra para establecer una relación de agregación. La primera clase
fue Publicidad esta tuvo un relación de agregación con la clase Actor, que ya fue usada. Esto demues-
tra la modularidad y la reutilización del código, característica propia de la POO. 

Se establecio otra relación de angregación entre la segunda clase Podcast e Invitado. Es importante 
destacar el uso de la clase Actor como plantilla para la clase Invitado, nuevamente destcando la 
reutilización del código. Estas nuevas clases se agregaron para extender el tipo de contenido al que
se puede acceder desde nuestra clase main, teniedno una aplicación mucho más amplia que puebe guardar
y abarcar más clasificaciones del contenido audiovisual.

La aplicación desarrollada tiene como propósito tener una base de datos para consultar datos importantes
de diferentes tipos de contenido audiovisual, teniendo una fuente confiable y rapida apra investigaciones
y consultas, e incluso con una futura actualizacion de la aplicacion apra ser un repositorio completo
de contenido audiovisual. Esto resuelve el problema de no contar con filtros adecuados para la fisltración
de contenido, además de sevir como base para aplicaciones de tipo streaming. 

Las cracterísticas principales de la aplicación son clases dividas entre diferentes tipos de contenido
audiovisual, oermitiendonos tener un amplio catálogo, por otro lado presenta relaciones entre clases y 
reutilizacion de las mismas, haciendola mas modular y facil de mantener en caso de actualizaciones, de 
igual manera gracias a estas caracter´siticas anteriores cuenta con un main limpio y ordenado para la
consulta.

Finalmente para poder clonar este proyecto se podra usar el IDE de su preferencia, por un lado podemos usar
eclipse, con su herrameinta de importacion directa. Ingresamos a eclipse, seleccionamos en File, buscamos
impor, ahi seleccionamos Git y dentro GitHub, dentro de este apartado insetamos el nombre del repositorio
PooTarea2, seleccionamos el proyecto y le damos a next, posteriormente a Finish y nuestro proyecto estara 
importado y listo apra usar.

Por otro lado podemos usar el IDE IntellIJ, en este IDE seleccionamos la opcion clone repository, copiamos el
link el repositorio y este se copiara automaticamente. Finalmente apra IDE's sin opciones de GitHub podemos 
ingresar al link del proyecto y en la seccion Code descargar el archivo .zip, después lo descomprimimos y 
abrimos el proyecto desde nuestro IDE en el explorador de archivos.

Se adjuntan imágenes de ejemplo:
<img width="1919" height="933" alt="image" src="https://github.com/user-attachments/assets/48f5aa15-46cd-49c4-84e5-c7a645686273" />
<img width="1918" height="1078" alt="image" src="https://github.com/user-attachments/assets/233143bb-392a-4d7f-a2c3-7953ff70fd43" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/67551c11-193f-4679-9d4a-da6f705b554e" />

