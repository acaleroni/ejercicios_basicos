import java.io.IOException;

public class trigonometria {
    //funcion que muestra el menu
    public static void menu() throws IOException, InterruptedException 
    {   
        // definimos una variable de tipo String para controlar el ciclo
        String control="x";
        String[] menu = {"1. Area de un rectangulo (b*h)","2. Area de un triangulo (Segun sus lados)","3. Perimetro y Area de un circulo","4. Volumen de un cilindro","5. Menu anterior"};
        while (control != "salir"){
           control = funciones.teclado(menu);
            switch (control){
                // se llama a una funcion dependiendo de la opcion que elija el usuario
                case "1":
                    funciones.limpiar();
                    area_rectangulo();
                break;
                case "2":
                    funciones.limpiar();
                    area_triangulo_lados();
                break;
                case "3":
                    funciones.limpiar();
                    pa_circ();
                break;
                case "4":
                    funciones.limpiar();
                    vol_cilindro();
                break;
                case "5":
                    control = "salir";
                break;
                default:
                    funciones.limpiar();
                    System.out.println("Obción no valida");
                    funciones.continuar();
                break;
            }
        }  
    }
    // funcion que calcula el volumen de un cilindro
    public static void vol_cilindro() throws IOException, InterruptedException {
        double radio = funciones.esdecimal("Ingrese el radio del cilindro: ");
        if(radio==-0.0){return;}
        double altura = funciones.esdecimal("Ingrese la altura del cilindro: ");
        if(altura==-0.0){return;}
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        funciones.limpiar();
        System.out.println("El volumen del cilindro es: " + volumen);
        funciones.continuar();
    }
    // funcion que calcula el area de un triangulo segun sus lados
    public static void area_triangulo_lados() throws IOException, InterruptedException {
        double lado1 = funciones.esdecimal("Ingrese el primer lado del triángulo: ");
        if(lado1==-0.0){return;}
        double lado2 = funciones.esdecimal("Ingrese el segundo lado del triángulo: ");
        if(lado2==-0.0){return;}
        double lado3 = funciones.esdecimal("Ingrese el tercer lado del triángulo: ");
        if(lado3==-0.0){return;}
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        funciones.limpiar();
        System.out.println("El área del triángulo es: " + area);
        funciones.continuar();
    }
    // funcion que calcula el area de un triangulo base por altura
    public static void area_rectangulo() throws IOException, InterruptedException{
        // definimos las variables que usaremos para guardar los datos ingresados por el usuario
        double b, h, a;
        // pedimos al usuario que ingrese los datos y los guardamos en las variables
        b = funciones.esdecimal("Ingrese la Base:");
        if(b==-0.0){return;}
        h = funciones.esdecimal("Ingrese la altura:");
        if(h==-0.0){return;}
        // calculamos el area
        a = b*h;
        // limpiamos la pantalla y mostramos los datos ingresados y el resultado
        funciones.limpiar();
        System.out.println("La base es: " + b);
        System.out.println("La altura es: " + h);
        System.out.println("El area es: " + a);
        funciones.continuar();    
    }
    // funcion que calcula el perimetro y el area de un circulo
    public static void pa_circ() throws IOException, InterruptedException{
        // definimos las variables que usaremos para guardar los datos ingresados por el usuario
        double r, p, a;
        // pedimos al usuario que ingrese los datos y los guardamos en las variables
        r = funciones.esdecimal("Ingrese el radio:");
        if(r==-0.0){return;}
        // calculamos el perimetro y el area
        p = 2 * Math.PI * r; 
        a = Math.PI*Math.pow(r, 2);
        // limpiamos la pantalla y mostramos los datos ingresados y el resultado
        funciones.limpiar();
        System.out.println("El radio es: " + r);
        System.out.println("El perimetro de la circunferencia es : " + p);
        System.out.println("El area del circulo es: " + a);
        funciones.continuar();    
    }
}
