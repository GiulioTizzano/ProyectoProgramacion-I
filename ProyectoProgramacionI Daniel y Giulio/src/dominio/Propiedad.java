package dominio;

public class Propiedad{
  String nombrePropietario;
  String numeroHabitaciones;
  String precioPropiedad;

	public Propiedad(String nombrePropietario, String numeroHabitaciones, String preciopPropiedad){
	  this.nombrePropietario = nombrePropietario;
	  this.numeroHabitaciones = numeroHabitaciones;
	  this.precioPropiedad = preciopPropiedad;	  
	}
	public String getNombrePropietario(){
	  return nombrePropietario;
	}
	public void setNombrepropietario(String nombrePropietario){
	  this.nombrePropietario = nombrePropietario;
	}
	public String getNumeroHabitaciones(){
	  return numeroHabitaciones;
	}
	public void setNumeroHabitaciones(String numeroHabitaciones){
	  this.numeroHabitaciones = numeroHabitaciones;
	}
	public String getPrecioPropiedad(){
	  return precioPropiedad;
	}
	public void setPrecioPropiedad(String precioPropiedad){
	  this.precioPropiedad = precioPropiedad;
	}
	public String toString(){
		return "Propietario: "+nombrePropietario+" N de Habitaciones: "+numeroHabitaciones+" Precio: "+precioPropiedad;
	}
}
