import java.io.IOException;
import java.util.Scanner;

public class funciones {
    // definimos una variable estatica de tipo Scanner para poder usarla en todas las funciones (capturar datos del usuario)
    private static Scanner teclado = new Scanner(System.in);
    // definimos una funcion que limpiara la pantalla
    public static void limpiar()throws IOException, InterruptedException
    {
        // usamos el comando cls de windows para limpiar la pantalla
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    // definimos una funcion que mostrara un mensaje y esperara a que el usuario presione enter para continuar
    public static void continuar(){
        System.out.println("Presione enter para continuar...");try{        System.in.read();}catch(Exception e){	e.printStackTrace();}
    }
    // definimos una funcion que mostrara un mensaje y pide una confirmacion al usuario
    public static String salir() throws IOException, InterruptedException
    {
        System.out.println("¿Seguro que desea salir? si/no");
        String retorno = "x";
                    String conf = teclado.nextLine();
                    // convertimos la cadena a minusculas para evitar errores
                    conf = conf.toLowerCase();
                    // si el usuario confirma la salida se cambia el valor de retorno a salir
                    if(conf.equalsIgnoreCase("si")){
                        retorno = "salir";      
                        // limpiamos la pantalla y mostramos un mensaje de despedida
                        limpiar();
                        System.out.println("Gracias por usar nuestro sistema");
                    }
                    return retorno;
    }
    // definimos una funcion que mostrara un mensaje y pedira un numero al usuario, si el usuario ingresa un valor no valido se le pedira que confirme si desea volver a intentarlo
    public static double esdecimal (String mensaje) throws IOException, InterruptedException
    {
        // definimos una variable booleana para controlar el ciclo
        boolean cont = false;
        double num =-0.0;
        // iniciamos el ciclo
        while (cont == false)
        {
            // limpiamos la pantalla y mostramos el mensaje que se le pasa como parametro desde la funcion que la llama
           limpiar();
           System.out.println(mensaje);     
           // si el valor ingresado es un numero valido se guarda en la variable num y se cambia el valor de cont a true para salir del ciclo
           if (teclado.hasNextDouble()) 
           {
             num = teclado.nextDouble();
             cont =true;
           } 
           // si el valor ingresado no es un numero valido se le pide al usuario que confirme si desea volver a intentarlo
          else 
          {
            limpiar();
            String validar;
            teclado.nextLine();
            System.out.println("El valor digitado no es un numero valido");
            System.out.println("Escriba si para salir");
            validar = teclado.nextLine();
            validar = validar.toLowerCase();
            // si el usuario confirma que desea salir se cambia el valor de cont a true para salir del ciclo
            if(validar.equalsIgnoreCase("si"))
            {
                limpiar();
                cont= true;  
                System.out.println("Gracias por esta función");
                continuar();    
                num = -0.0;
            }
          }
        }
        //limpio el escaner para evitar conflictos
        teclado.nextLine();  
        return num;
    }
    public static int esentero (String mensaje) throws IOException, InterruptedException
    {
        // definimos una variable booleana para controlar el ciclo
        boolean cont = false;
        int num =-0;
        // iniciamos el ciclo
        while (cont == false)
        {
            // limpiamos la pantalla y mostramos el mensaje que se le pasa como parametro desde la funcion que la llama
           limpiar();
           System.out.println(mensaje);     
           // si el valor ingresado es un numero valido se guarda en la variable num y se cambia el valor de cont a true para salir del ciclo
           if (teclado.hasNextInt()) 
           {
             num = teclado.nextInt();
             cont =true;
           } 
           // si el valor ingresado no es un numero valido se le pide al usuario que confirme si desea volver a intentarlo
          else 
          {
            limpiar();
            String validar;
            teclado.nextLine();
            System.out.println("El valor digitado no es un numero valido");
            System.out.println("Escriba si para salir");
            validar = teclado.nextLine();
            validar = validar.toLowerCase();
            // si el usuario confirma que desea salir se cambia el valor de cont a true para salir del ciclo
            if(validar.equalsIgnoreCase("si"))
            {
              limpiar();
                cont= true;  
                System.out.println("Gracias por esta función");
                continuar();    
                num = -0;
            }
          }
        }
        //limpio el escaner para evitar conflictos
        teclado.nextLine();  
        return num;
    }
}