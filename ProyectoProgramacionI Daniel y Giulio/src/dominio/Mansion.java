package dominio;
public class Mansion extends Propiedad{
	String mDePiscina;
	String nDeEmpleados;
	String nombreMayordomo;
	public Mansion(String p, String e, String m, String du, String hab, String pr){
		super(du, hab, pr);
		mDePiscina=p;
		nDeEmpleados=e;
		nombreMayordomo=m;
	}
	public void setMPiscina(String p){
		this.mDePiscina=p;
	}
	public void setNEmpleados(String e){
        this.nDeEmpleados=e;
    }
	public void setNMayordomo(String m){
        this.nombreMayordomo=m;
    }
	public String getMPiscina(){
		return mDePiscina;
	}
	
	public String getNEmpleados(){
        return this.nDeEmpleados;
    }
	public String getNMayordomo(){
         return this.nombreMayordomo;
    }
	public String toString(){
		return "MANSION"+"\n" + "Propietario: " + nombrePropietario + " N de Habitaciones: " + numeroHabitaciones + " Area: " + " Precio: "+ precioPropiedad+ " M Piscina: "+ mDePiscina+ " Numero de Empleados: "+ nDeEmpleados + " Nombre Mayordomo: "+ nombreMayordomo;
	}
}
