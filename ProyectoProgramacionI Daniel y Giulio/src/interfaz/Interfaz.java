package interfaz;
import java.util.Scanner;
import dominio.*;

public class Interfaz{

	public boolean procesarPeticion (String peticion, CatalogoPropiedades c){
		String [] p=peticion.split(" ");
		if (p[0].equals("add")){
			if(p[1].equals("Piso")){
				c.add(new Piso(p[2],p[3],p[4],p[5],p[6],p[7]));
			}
			else if (p[1].equals("Chalet")){
				c.add(new Chalet(p[2],p[3],p[4],p[5],p[6],p[7]));

			}
			else if (p[1].equals("Mansion")){
				c.add(new Mansion(p[2],p[3],p[4],p[5],p[6],p[7]));
			}

		}

		else {
			if (p[0].equals("list")){
				System.out.print (c);
			}
			else if (p[0].equals("help")) {
				System.out.print("introduzca una de las siguientes peticiones: \n add Piso Propietario NumHabitaciones Precio NumPiso Planta Calle: añadir piso a el catalogo de propiedades \n add Chalet Propietario NumHabitaciones Precio MetrosJardin NumPlantas NumCochesGaraje: añadir chalet a el catalogo de propiedades\n add Piso Propietario NumHabitaciones Precio MetrosPiscina NumEmpleados NombreMayordomo: añadir mansion a el catalogo de propiedades\n list: listar la agenda\n exit: salir\n");
			}		
			else if (p[0].equals("exit")){
				return false;
			}
			else {
				System.out.print("petición erronea");
				procesarPeticion("help",c);
			}
		}
		return true;
	}

	public String leerPeticion(){
		Scanner sc = new Scanner(System.in);
  		System.out.print(">");
		String cadena = sc.nextLine();
		return cadena;
	}

}
