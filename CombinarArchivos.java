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

public class CombinarArchivos{

        public static void main(String[] args){
                File archivo = null;
                FileReader fr = null;
                BufferedReader br = null;
                System.out.println("El sistema operativo es " + System.getProperty("os.name"));
                System.out.println("El simbolo de separacion es " + System.getProperty("file.separator"));
                System.out.println("Se ingresaron " + args.length + " argumentos");
                try{
                        System.out.println("Tratando de leer el archivo");
                        if (System.getProperty("os.name").equals("Linux")){
                                archivo = new File("/home/dcolmenares/archivo.txt");
                        }
                        else{
                                archivo = new File("C:/archivo.txt");
                        }
                        if (archivo.exists()){
                                System.out.println("El archivo existe");
                                System.out.println("El archivo leido es " + archivo.getName());
                        }
                }catch(Exception e){
                        System.out.println("Problemas al leer el archivo");
                }finally{
                }
        }
}
