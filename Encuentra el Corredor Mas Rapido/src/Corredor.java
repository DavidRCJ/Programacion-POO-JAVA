// David Ricardo Cruz Juarez
//Clase corredor aqui creamos la clase corredor, y sus atributos on sus metodos: numero de corredor, nombre del corredor, tiempo 
public class Corredor {
    private String num_atleta;
    private String nombre;
    private float tiempo;
  
//Constructor
 public Corredor(String nombre,String num_atleta, float tiempo){
    this.num_atleta = num_atleta;
    this.nombre = nombre;
    this.tiempo = tiempo; 
    }  
    //metodos para obtener el tiempo
    public float getTiempo(){
        return tiempo;
    }
    public String mostrarDatos(){
        return("\n Nombre:  "+nombre+"\n Numero de corredor :  "+num_atleta+"\n Tiempo:  "+tiempo+"\n");
    }
}