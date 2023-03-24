import java.io.IOException;
import java.util.Scanner;

public class algebra {
    static Scanner teclado = new Scanner(System.in);
    public static void menu() throws IOException, InterruptedException 
    {
        String control="x";
        while (control != "salir"){
            funciones.limpiar();
            System.out.println("1. Determina la funcion Y= X*C-2");
            System.out.println("2. Determina la funcion  Y= 5X^4 + 2X^3 + 3X^2 + 7");
            System.out.println("3. Raiz Cuadrada de un numero");
            System.out.println("4. Convertir Kilogramos a Libras");
            System.out.println("5. Convertir grados Fahrenheit a grados Celsius");
            System.out.println("6. Menu anterior");
            control = teclado.nextLine();
            switch (control){
                case "1":
                    funciones.limpiar();
                    fy();
                break;
                case "2":
                    funciones.limpiar();
                    fy2();
                break;
                case "3":
                    funciones.limpiar();
                    raiz();
                break;
                case "4":
                funciones.limpiar();
                ckl();
                break;
                case "5":
                funciones.limpiar();
                cfc();
                break;
                case "6":
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
    private static void cfc() throws IOException, InterruptedException {
        double f,c;
        f = funciones.esdecimal("Ingrese la temperatura en grados Fahrenheit");
        c = (f-32) * (5/9);
        funciones.limpiar();
        System.out.println(f + "grados fahrenheit, son:  " + c + "grados centigrados");
        funciones.continuar();
    }
    public static void fy() throws IOException, InterruptedException
    {
       final double c = 2.5;
       double r, x;
       x = funciones.esdecimal("Digite el valor de x");
       r=1*c-2;
       funciones.limpiar();
       System.out.println("El valor de Y cuando x=1 es: " + r);
       r=x*c-2;
       System.out.println("El valor de Y cuando x=" +x+" es: "  + r);
       funciones.continuar();
    }
    public static void fy2() throws IOException, InterruptedException
    {
       double r, x;
       x = funciones.esdecimal("Digite el valor de x");
       r= 5 + 2 + 3 + 7;
       funciones.limpiar();
       System.out.println("El valor de Y cuando x=1 es: " + r);
       r=(5* Math.pow(x, 4)) + (2* Math.pow(x, 3)) + (3* Math.pow(x, 2)) + 7;
       System.out.println("El valor de Y cuando x=" +x+" es: "  + r);
       funciones.continuar();
    }
    public static void raiz() throws IOException, InterruptedException
    {
       double r, n;
       n = funciones.esdecimal("Digite el numero del que desea la raiz cuadrada");
       if(n!=-0.0){
       r=Math.sqrt(n);
       funciones.limpiar();
       System.out.println("La raiz cuadrada de: " + n + " es: " + r);
       funciones.continuar();
       }
    }
    public static void ckl() throws IOException, InterruptedException {
        double k,l;
        k = funciones.esdecimal("Ingrese el peso en kilogramos");
        l = k*2.2;
        funciones.limpiar();
        System.out.println(k + " kilogramos equivalen a: " + l + " libras");
        funciones.continuar();
    }
    
}
