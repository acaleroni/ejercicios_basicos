import java.io.IOException;
import java.util.Scanner;

public class funciones {
    static Scanner teclado = new Scanner(System.in);
    public static void limpiar()throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static void continuar(){
        System.out.println("Presione enter para continuar...");try{        System.in.read();}catch(Exception e){	e.printStackTrace();}
    }

    public static String salir() throws IOException, InterruptedException
    {
        teclado.nextLine();
        System.out.println("¿Seguro que desea salir? si/no");
        String retorno = "x";
                    String conf = teclado.nextLine();
                    conf = conf.toLowerCase();
                    if(conf.equalsIgnoreCase("si")){
                        retorno = "salir";      
                        limpiar();
                        System.out.println("Gracias por usar nuestro sistema");
                    }
                    return retorno;
    }
    public static double esdecimal (String mensaje) throws IOException, InterruptedException
    {
        boolean cont = false;
        double num =-0.0;
        
        while (cont == false)
        {
           limpiar();
           System.out.println(mensaje);     
           if (teclado.hasNextDouble()) 
           {
             num = teclado.nextDouble();
             cont =true;
           } 
          else 
          {
            limpiar();
            String validar;
            teclado.nextLine();
            System.out.println("El valor digitado no es un numero valido");
            System.out.println("Escriba si para intentarlo de nuevo");
            validar = teclado.nextLine();
            validar = validar.toLowerCase();
            if(!validar.equalsIgnoreCase("si"))
            {
                cont= true;  
                System.out.println("Gracias por esta función");
                continuar();    
                num = -0.0;
            }
          }
        }
        return num;
    }
}
