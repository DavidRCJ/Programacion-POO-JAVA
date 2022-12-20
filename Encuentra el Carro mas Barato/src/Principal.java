/*Ejercicio 3      David Ricardo Cruz Juárez
Construir un programa que dada un serie de vehiculos caracterziados por su marca,modelo y precio, 
imprioma las propiedades de vehiculo más barato. Para ello deberan leer por teclado las caracteristicas
de cada vehículo y crear una clase que represente cada uno de ellos
*/ 
import java.util.Scanner;

public class Principal {
    
     public static int indiceCocheBarato(Vehiculo coches[]){
        int indice = 0;
        float precio;                
        precio = coches[0].getPrecio();
        for(int j =1 ; j<coches.length; j++){
            if(coches[j].getPrecio()<precio){
                precio = coches[j].getPrecio();
                indice = j;
            }
        }
        return indice;
    }
   
      public static void main(String [] args){        
            try (Scanner entrada = new Scanner(System.in)) {
                String marca;
                String modelo;
                float precio=0;
                int numero_vehiculos;
                int indiceBar=0;
                
                System.out.print("Digitalize la cantidad de vehiculos\n");
                numero_vehiculos= entrada.nextInt();
                //creacion de objetos para los coches
                Vehiculo coches[] = new Vehiculo[numero_vehiculos];
                  
                for(int i=0; i<coches.length;i++){
                        entrada.nextLine();
                        System.out.println("Digitaliza  las caractristicas del coche "+(i+1)+":");
                        System.out.print("Intruce Marca del Vehiculo:");
                        marca = entrada.nextLine();
                        System.out.print("Intruce Modelo del Vehiculo:");
                        modelo = entrada.nextLine();
                        System.out.print("Intruce Precio del Vehiculo:");
                        precio = entrada.nextFloat();
                        coches[i] = new Vehiculo(marca, modelo,precio);
                    }
                indiceBar =indiceCocheBarato(coches);
                System.out.print("El coche mas barato es: \n");
                System.out.print(coches[indiceBar].mostrarDatos());
            }
    }
 }       
