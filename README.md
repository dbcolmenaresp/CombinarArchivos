# CombinarArchivos
Clase en java SE para combinar 2 o mas archivos en formato plano en un unico archivo.

Se desea crear una clase de java que ayude en la edicion automatica de archivos planos para su combinacion en un unico archivo.

Inicialmente se necesita ejecutar uno de los dos siguientes procesos:

	1 Editar un archivo eliminando su encabezado y guardarlo en otro archivo con otro nombre indicado
	2 Combinar 2 archivos eliminandoles el encabezado, dentro de un tercer archivo indicado

Al analizar este escenario para la creacion de la clase de acuerdo con los requerimientos indicados, resalta que se puede generalizar el mismo a editar los archivos pasados por parametro, eliminando su encabezado, y guardando el archivo combinado en un nuevo archivo pasado por parametro a la clase.

Adicionalmente se agregara un parametro adicional a la lista de argumentos de la clase, para indicar si se va a eliminar o no el encabezado de los archivos que se van a combinar.

Esta clase se va a desarrollar con el lenguaje de programacion Java SE, para ser ejecutado desde otro sistema que hace una llamada a una funcion del sistema que a su vez encomienda un archivo .bat para la ejecucion de la clase desarrollada.

La llamada a la funcion del sistema incluye todos los argumentos necesarios para la ejecucion de la clase:

	1 Tipo de combinacion de archivos:
		a Con encabezado
		b Sin encabezado
	2 Listado de archivos a combinar
	3 Nombre de archivo destino
	
Adicionalmente se debe realizar las validaciones correspondientes para evitar errores al invocar la clase:

	1 validar que el numero de parametros que se pasan a la clase sea el suficiente para una ejecucion exitosa
	2 Validar que efectivamente existan los archivos que se van a combinar en el metodo correspondiente de la clase

En caso de no complir con alguna de las validaciones, se debe desplegar el mensaje correspondiente para su tratamiento y correccion adecuado.

Enlaces utilizados:

Paquete java.io
https://darkbyteblog.wordpress.com/2011/01/19/java-paquete-java-io-introduccion-a-los-flujos-de-datosio/

La clase File de java
http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/archivos/file.htm

Lectura y escritura de ficheros en java
http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java
