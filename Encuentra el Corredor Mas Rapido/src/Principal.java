/*Ejercicio 4 Construir un programa para competencia de atletismo, el programa debe gestionar, 
una serie de atletas caracterizados por:
                Numero de atleta, Nombre, tiempo
Al final mostrar los datos del atleta ganador
Lo que bucamos es mostrar el atleta con menor tiempo*/

import java.util.Scanner;

public class Principal {
    
     public static int indiceCorredorRapido(Corredor corredores[]){
        int indice = 0;
        float tiempo;                
        tiempo = corredores[0].getTiempo();
        for(int j =1 ; j<corredores.length; j++){
            if(corredores[j].getTiempo()<tiempo){
                tiempo = corredores[j].getTiempo();
                indice = j;
            }
        }
        return indice;
    }
   
      public static void main(String [] args){        
            try (Scanner entrada = new Scanner(System.in)) {
                String num_atleta;
                String nombre;
                float tiempo=0;
                int numero_corredores;
                int indiceBar=0;
                
                System.out.print("Digitalize la cantidad de Corredores\n");
                numero_corredores= entrada.nextInt();
                //creacion de objetos para los coches
                Corredor corredores[] = new Corredor[numero_corredores];
                  
                for(int i=0; i<corredores.length;i++){
                        entrada.nextLine();
                        System.out.println("El corredor "+(i+1)+":");
                        System.out.print("Intruce su Nombre:");
                        nombre= entrada.nextLine();
                        System.out.print("Intruce Su numero de registro de corredor:");
                        num_atleta = entrada.nextLine();                       
                        System.out.print("Intruce Su tiempo de carrera:");
                        tiempo = entrada.nextFloat();
                        corredores[i] = new  Corredor ( nombre, num_atleta, tiempo);
                    }
                indiceBar =indiceCorredorRapido(corredores);
                System.out.print("El corredor ganador es corredor: \n");
                System.out.print(corredores[indiceBar].mostrarDatos());
            }
    }
 }       
