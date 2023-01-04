package dominio;
public class Chalet extends Propiedad{

	private String metrosJardin;
	private String nDePisos;
	private String nDeCochesGarage;
	public Chalet(String jardin, String pisos, String garage, String dueno, String hab, String precio){
		super(dueno, hab, precio);
		metrosJardin=jardin;
		nDePisos=pisos;
		nDeCochesGarage=garage;
		
	}
	public void setJardin(String j){
		metrosJardin=j;
	}
	public void setPisos(String p){
                metrosJardin=p;
        }
	public void setGarage(String g){
                metrosJardin=g;
        }
	public String getJardin(){
		return metrosJardin;
	}
	public String getPisos(){
                return nDePisos;
        }
	public String getGarage(){
                return nDeCochesGarage;
        }
		
	public String toString(){
		return "CHALET"+ "\n"+"Propietario: "+ nombrePropietario +" N de Habitaciones: "+ numeroHabitaciones + " Precio: "+ precioPropiedad + " Jardin: "+ metrosJardin + " N de Pisos: "+ nDePisos + " N de Coches Garage: " + nDeCochesGarage;
	}
}

