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
        System.out.println("Presione enter para continuar...");
        teclado.nextLine();
    }
    // definimos una funcion que mostrara un mensaje y pedira un numero al usuario, si el usuario ingresa un valor no valido se le pedira que confirme si desea volver a intentarlo, si es valido devuelve un double
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
                return num;
            }
          }
        }
        //limpio el escaner para evitar conflictos
        teclado.nextLine();  
        return num;
    }
    // definimos una funcion que mostrara un mensaje y pedira un numero al usuario, si el usuario ingresa un valor no valido se le pedira que confirme si desea volver a intentarlo, si es valido devuelve un entero
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
                return num;
            }
          }
        }
        //limpio el escaner para evitar conflictos
        teclado.nextLine();  
        return num;
    }
    // definimos una funcion que mostrara un mensaje y espera que se teclee una opcióm, devuelve un String
    public static String teclado (String mensaje[]) throws IOException, InterruptedException
    {
      limpiar();
      for (int i = 0; i < mensaje.length; i++) {
        System.out.println(mensaje[i]);     
      }     
      return teclado.nextLine();
    }
    // funcion que dibuja una interfaz de tablas
    public static void tabla (String encabezado, String datos[][]) throws IOException, InterruptedException
    {
      limpiar();
      int sizet = 0;
      int[] sizec = new int[datos[0].length];
      //definimos el tamaño de las columnas 
      for(int i=0; i<datos.length;i++ ){
          for(int j=0; j<datos[0].length;j++ )
          {     
           if(datos[i][j].length()>sizec[j])
            {
              sizec[j] = datos[i][j].length();
            }
          }  
        }
        for(int i=0;i<sizec.length;i++)
        {
          sizet = sizet + sizec[i]+2;
        }
      // imprimimos el encabezado
 
      int  siz1 = ((sizet+encabezado.length())/2);
      if(datos[0].length%2==0)
      siz1 = (sizet-siz1+1);
      else
      siz1 = (sizet-siz1);
      System.out.printf(String.format("\u001B[1m\u001B[4m%%%ds \n",sizet+3),"_");
      System.out.printf(String.format("\u001B[1m\u001B[4m|%%%ds ", (sizet+encabezado.length())/2)+String.format("\u001B[1m\u001B[4m %%%ds|", siz1), encabezado, "");
      //imprimimos el contenido
       for (int i=0;i<datos.length;i++)
      {
          System.out.println("");
          for(int j=0; j<datos[0].length;j++ )
          {
            int siz = -sizec[j];
            if(j>0)
            System.out.printf(String.format("\u001B[0m\u001B[4m %%%ds |\u001B[0m", siz), datos[i][j]);
            else
            System.out.printf(String.format("\u001B[0m\u001B[4m| %%%ds |\u001B[0m", siz), datos[i][j]);
          }  
      }  
      System.out.println("");
      continuar();
    }
    static String[][] llenar() throws IOException, InterruptedException{
      limpiar();
      String[][] tabla = new String[4][4];
      tabla[0][0] = "Nombre del Articulo";
      tabla[0][1] = "Precio";
      tabla[0][2] = "Cantidad";
      tabla[0][3] = "Total";
      tabla[1][0] = "Arroz";
      tabla[1][1] = "18";
      tabla[1][2] = "2";
      tabla[1][3] = "36";
      tabla[2][0] = "Frijoles en salsa de tomate";
      tabla[2][1] = "20";
      tabla[2][2] = "1";
      tabla[2][3] = "20";
      tabla[3][0] = "pan";
      tabla[3][1] = "5";
      tabla[3][2] = "10";
      tabla[3][3] = "50";
     /*  for (int i=1;i<4;i++)
      {
          System.out.println("");
          for(int j=0; j<3;j++ )
          {
              System.out.print("Ingrese " + tabla[0][j] +": ");
              tabla[i][j] = teclado.nextLine();
              if(j==2){
                  int total = Integer.parseInt(tabla[i][1])*Integer.parseInt(tabla[i][2]);
                  tabla[i][3] =  String.valueOf(total);
              }
          }  
      }*/
      return tabla;
    }
  } 