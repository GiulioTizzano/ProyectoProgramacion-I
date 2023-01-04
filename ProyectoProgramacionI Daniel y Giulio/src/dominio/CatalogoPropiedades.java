package dominio;
import java.io.Serializable;
import java.util.*;

public class CatalogoPropiedades implements Serializable{
  private ArrayList <Propiedad> lista;

  public CatalogoPropiedades(){
	  lista=new ArrayList<Propiedad>();
  }
  public CatalogoPropiedades add(Propiedad p){
	  lista.add(p);
	  return this;
  }
  public String toString(){
	  String cadena="";
	  for (Propiedad p:lista)
		  cadena+=p+"\n";
    return cadena;
  }
}


