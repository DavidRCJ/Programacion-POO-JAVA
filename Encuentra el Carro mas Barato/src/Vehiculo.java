/*David Ricardo Cruz Juarez
Clase Vehiculo donde creamos los atributios y metodos obtener
        Marca, Modelo, Precio
*/

public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;
  
//Constructor
 public Vehiculo(String marca,String modelo, float precio){
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio; 
    }  
    //metodos para obtener el precio
    public float getPrecio(){
        return precio;
    }
    public String mostrarDatos(){
        return( "\n Marca: "+marca+"\n Modelo: "+modelo+"\n Precio: "+precio+"\n");
    }
}
