package aplicacion;
import java.io.*;
import dominio.*;
import interfaz.Interfaz;

public class Principal{
	public static void main(String [] args){
		ObjectInputStream fi;
		ObjectOutputStream fo;
		CatalogoPropiedades c;
		try {
			fi=new ObjectInputStream(
			new FileInputStream("catalogo.txt"));
			c= (CatalogoPropiedades) fi.readObject();
			fi.close();
		} catch (Exception e) {
			c=new CatalogoPropiedades();
		}
		Interfaz IU=new Interfaz();
		String peticion;
		IU.procesarPeticion("help",c);
		do {
			peticion=IU.leerPeticion();
		} while (IU.procesarPeticion(peticion,c));
		System.out.print("fin. Guardando el catalogo");
		try {
			fo=new ObjectOutputStream(new FileOutputStream("catalogo.txt"));
			fo.writeObject(c);
			fo.close();
		}catch (Exception e){
			System.out.print("Error al crear el fichero");
		}
	}
}
