package dominio;

public class Piso extends Propiedad{
  String numeroPiso;
  String plantaPiso;
  String callePiso;

	public Piso(String du, String hab, String pr, String numeroPiso, String plantaPiso, String callePiso){
	  super(du, hab, pr);
	  this.numeroPiso = numeroPiso;
	  this.plantaPiso = plantaPiso;
	  this.callePiso = callePiso;
	}
	public String getNumeroPiso(){
	  return numeroPiso;
	}
	public void setNumeroPiso(String	 numeroPiso){
	  this.numeroPiso = numeroPiso;
	}
	public String getPlantaPiso(){
	  return numeroPiso;
	}
	public void setPlantaPiso(String numeroPiso){
	  this.numeroPiso = numeroPiso;
	}
	
	public String getCallePiso(){
	return callePiso;
	}
	public void setCallePiso(){
	  callePiso = callePiso;
	}
	public String toString(){
	return "PISO"+ "\n" + "Propietario: " + nombrePropietario + " N de Habitaciones: " + numeroHabitaciones + " Precio: "+ precioPropiedad + " N Piso: " + numeroPiso + " Planta: " + plantaPiso + " Calle: " + callePiso;
	}
}