# ProyectoProgramacion-I
Proyecto asignatura programación I programado por Giulio Tizzano y Daniel Gómez

En este proyecto teníamos que programar un sistema que funcionara de forma local con una interfaz gráfica de texto con
tratamiento tanto de cadenas tanto como de números (en caso de usarlos) y finalmente había que poder tratar con al menos tres 
atributos por cada clase. Este software consta de un catálogo de propiedades inmobiliarias (pisos, mansiones y chalets)
capaz de ocuparse del alta, baja y modificaciones de las mismas. 

En el proyecto se incluyen las siguentes elementos:
Una superclase llamada Propiedad seguida por sus subsclases Mansion, Chalet, Piso  y CatalogoPropiedades que es una clase que contiene 
todos los datos de las diferentes propiedades dentro de un contenedor llamado ArrayList. Dichas clases están contenidos dentro del paquete 'dominio'. Luego, también hay un fichero llamado 
Interfaz donde se manejan todos los posibles parámetros que se les puede pasar al programa dentro del paquete Interfaz. Dentro de interfaz hay dos métodos diferentes, el primero se llama
ProcesarPeticion. Su trabajo es parametrizar la interfaz gráfica de texto para que el usuario pueda interactuar con ella. LeerPeticion en cambio se ocupa de 
parsear cada peticion línea por línea. Por último tenemos la clase Principal dentro del paquete aplicación cuyo trabajo es poner en funcionamiento todo el 
software en su conjunto. Dentro de aplicacion también se manejan todos los posibles errores de entrada/salida gracias a la librería Java.io.* que permite el
control del flujo de standard input/output.
