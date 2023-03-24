import java.util.Scanner;
import java.io.IOException;

public class trigonometria {
    static Scanner teclado = new Scanner(System.in);
    public static void menu() throws IOException, InterruptedException 
    {
        String control="x";
        while (control != "salir"){
            funciones.limpiar();
            System.out.println("1. Area de un triangulo");
            System.out.println("2. Perimetro y Area de un circulo");
            System.out.println("3. Menu anterior");
            control = teclado.nextLine();
            switch (control){
                case "1":
                    funciones.limpiar();
                    area_triangulo();
                break;
                case "2":
                    funciones.limpiar();
                    pa_circ();
                break;
                case "3":
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
    private static void area_triangulo() throws IOException, InterruptedException{
        double b, h, a;
        b = funciones.esdecimal("Ingrese la Base:");
        h = funciones.esdecimal("Ingrese la altura:");
        a = b*h;
        funciones.limpiar();
        System.out.println("La base es: " + b);
        System.out.println("La altura es: " + h);
        System.out.println("El area es: " + a);
        funciones.continuar();    
    }
    private static void pa_circ() throws IOException, InterruptedException{
        double r, p, a;
        r = funciones.esdecimal("Ingrese el radio:");
        p = 2 * Math.PI * r; 
        a = Math.PI*Math.pow(r, 2);
        funciones.limpiar();
        System.out.println("El radio es: " + r);
        System.out.println("El perimetro de la circunferencia es : " + p);
        System.out.println("El area del circulo es: " + a);
        funciones.continuar();    
    }
}
