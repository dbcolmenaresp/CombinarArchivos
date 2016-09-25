/* Clase en java SE para combinar 2 o mas archivos en formato plano en un unico archivo.
	1 Editar un archivo eliminando su encabezado y guardarlo en otro archivo con otro nombre indicado
	2 Combinar 2 archivos eliminandoles el encabezado, dentro de un tercer archivo indicado
	1 Tipo de combinacion de archivos:
    	a Con encabezado
    	b Sin encabezado
	2 Listado de archivos a combinar
	3 Nombre de archivo destino
		1 validar que el numero de parametros que se pasan a la clase sea el suficiente para una ejecucion exitosa
	2 Validar que efectivamente existan los archivos que se van a combinar en el metodo correspondiente de la clase
*/

import java.io.*;
import java.util.*;

public class CombinarArchivos{
        
        public static void main(String[] args){
                File archivo = null;
		ArrayList<File> archivos = new ArrayList<File>();
                FileReader fr = null;
                BufferedReader br = null;
// Se valida que existan 2 o mas nombres de archivos para editar, entrada y salida
		if (args.length >= 2){
// Se llena un arreglo con los archivos pasados en los argumentos
			for (int i = 0; i < args.length; i++) {
				archivos.add(new File(args[i]));
			}
			System.out.println("Se almacenaron " + archivos.size() + " archivos");
// Se examina para validar todos los archivos pasados como argumentos
			boolean archivosCorrectos = true;
			for(int i = 0; i < archivos.size(); i++){
				if (!archivos.get(i).exists()){
					System.out.println("El archivo " + archivos.get(i).getName() + " no existe");
					archivosCorrectos = false;
				}else{
					System.out.println("El archivo" + archivos.get(i).getName() + " es correcto");
				}
			}
			if (!archivosCorrectos){
				System.out.println("Hay un error en los argumentos");
			}else{
				System.out.println("Se procesan los archivos pasados como parametros");
			}
		}else{
			System.out.println("Debe colocar al menos dos nombres de archivos para editar");
		}
        }
}
