import java.io.IOException;

public class fisica {
    // funcion que muestra el menu
    public static void menu() throws IOException, InterruptedException {
         // definimos una variable de tipo String para controlar el ciclo
         String[] menu = {"1. Fuerza de un cuerpo","2. Energia total de un cuerpo","3. Menu anterior"};
         String control="x";
         while (control != "salir"){
             // pedimos al usuario que ingrese una opcion y la guardamos en la variable control
             control = funciones.teclado(menu);
             switch (control){
                 // se llama a una funcion dependiendo de la opcion que elija el usuario
                 case "1":
                     funciones.limpiar();
                     Fuerza_cuerpo();
                 break;
                 case "2":
                     funciones.limpiar();
                     Energia_cuerpo();
                 break;
                 case "3":
                       control = "salir";
                 break;
                 default:
                     funciones.limpiar();
                     System.out.println("Obción no valida");
                 break;
             }
         } 
    }
    // funcion que calcula la energia de un cuerpo
   public static void Energia_cuerpo() throws IOException, InterruptedException {
    final double g = 9.8; // constante de gravedad
    double masa, altura, velocidad, energiaCinetica, energiaPotencial, energiaTotal;
    masa = funciones.esdecimal("Ingrese la masa del objeto: ");
    if(masa==-0.0){return;}
    altura = funciones.esdecimal("Ingrese la altura del objeto: ");
    if(altura==-0.0){return;}
    velocidad = funciones.esdecimal("Ingrese la velocidad del objeto: ");
    if(velocidad==-0.0){return;}
    funciones.limpiar();
    energiaCinetica = 0.5 * masa * Math.pow(velocidad,2);
    energiaPotencial = masa * altura * g;
    energiaTotal = energiaCinetica + energiaPotencial;
    System.out.println("La energia cinetica del objeto es: " + energiaCinetica);
    System.out.println("La energia potencial del objeto es: " + energiaPotencial);
    System.out.println("La energia total del objeto es: " + energiaTotal);
    funciones.continuar();
    }
    // funcion que calcula la fuerza de un cuerpo
    public static void Fuerza_cuerpo() throws IOException, InterruptedException {
        // se pide al usuario que ingrese la masa y la aceleracion del objeto
        double masa = funciones.esdecimal("Ingrese la masa del objeto: ");
        if(masa==-0.0){return;}
        double aceleracion = funciones.esdecimal("Ingrese la aceleracion del objeto: ");
        if(aceleracion==-0.0){return;}
        // se calcula la fuerza del objeto
        double Fuerza = masa * aceleracion;
        // se muestra el resultado
        funciones.limpiar();
        System.out.println("La fuerza del objeto es: " + Fuerza);
        funciones.continuar();
    }
}
