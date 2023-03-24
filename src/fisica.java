import java.io.IOException;
import java.util.Scanner;

public class fisica {
    static Scanner teclado = new Scanner(System.in);
    public static void menu() throws IOException, InterruptedException {
         // definimos una variable de tipo String para controlar el ciclo
         String control="x";
         while (control != "salir"){
             // limpiamos la pantalla y mostramos el menu
             funciones.limpiar();
             System.out.println("1. Fuerza de un cuerpo");
             System.out.println("2. Menu anterior");
             // pedimos al usuario que ingrese una opcion y la guardamos en la variable control
             control = teclado.nextLine();
             switch (control){
                 // se llama a una funcion dependiendo de la opcion que elija el usuario
                 case "1":
                     funciones.limpiar();
                     Fuerza_cuerpo();
                 break;
                 case "2":
                       control = "salir";      
                       System.out.println(control);
                 break;
                 default:
                     funciones.limpiar();
                     System.out.println("Obción no valida");
                 break;
             }
         } 
    }
    private static void Fuerza_cuerpo() throws IOException, InterruptedException {
        // se pide al usuario que ingrese la masa y la aceleracion del objeto
        double masa = funciones.esdecimal("Ingrese la masa del objeto: ");
        double aceleracion = funciones.esdecimal("Ingrese la aceleracion del objeto: ");
        // se calcula la fuerza del objeto
        double Fuerza = masa * aceleracion;
        // se muestra el resultado
        funciones.limpiar();
        System.out.println("La fuerza del objeto es: " + Fuerza);
        funciones.continuar();
    }
}
