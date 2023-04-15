import java.io.IOException;

public class algebra {
    public static void menu() throws IOException, InterruptedException 
    {
        String[] menu = {"1. Determina la funcion Y= X*C-2","2. Determina la funcion  Y= 5X^4 + 2X^3 + 3X^2 + 7","3. Raiz Cuadrada de un numero","4. Convertir Kilogramos a Libras","5. Convertir grados Fahrenheit a grados Celsius","6. Promediar Notas","7. Menu anterior"};
        String control="x";
        //el menu se mostrara asta que el usuario escoja salir (el while repetira el menú asta que control sea salir)
        while (control != "salir"){
            // pedimos al usuario que ingrese una opcion y la guardamos en la variable control
            control = funciones.teclado(menu);
            switch (control){
                // ejecutamos una opcion segun la seleccion, en cada caso limpiamos la pantalla y llamamos a la funcion correspondiente
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
                funciones.limpiar();
                promedionotas();
                break;
                case "7":
                      control = "salir";      
                break;
                default:
                //limpiamos la pantalla y mostramos un mensaje de error
                    funciones.limpiar();
                    System.out.println("Obción no valida");
                break;
            }
        }  
    }
    // aqui se encuentran las funciones que se llaman desde el menu
   //funcion que calcula el promedio de notas
    private static void promedionotas() throws IOException, InterruptedException {
        double promedio, nota=0, nota1=0;
        int n;
        n  = funciones.esentero("Ingrese el numero de notas a promediar");
        if(n==0){return;}
        for(int i=0; i<n;i++)
        {
            if (i==0)
            {
                nota1 = funciones.esdecimal("Ingrese la primer nota");
                if(nota1!=-0.0)
                {
                nota = nota + nota1;
                }   
                else
                {
                    nota = -0.0;
                    break;
                }
            }
            else if(i==n-1)
            {
                funciones.limpiar();
                nota1 = funciones.esdecimal("Ingrese la ultima nota");
                if(nota1!=-0.0)
                {
                nota = nota + nota1;
                }   
                else
                {
                    nota = -0.0;
                    break;
                }
            }
            else
            {
                funciones.limpiar();
                nota1 = funciones.esdecimal("Ingrese la siguiente nota");
                if(nota1!=-0.0)
                {
                nota = nota + nota1;
                }   
                else
                {
                    nota = -0.0;
                    break;
                }
            }
        }
        if(nota!=-0.0){
        funciones.limpiar();
        promedio = nota / n;
        System.out.println("El promedio es: " + promedio);
        funciones.continuar();
        }
    }
   // funcion que convierte grados fahrenheit a grados centigrados
    private static void cfc() throws IOException, InterruptedException {
        // definimos las variables
        double fahrenheit,celcius;
        // pedimos los datos al usuario con la funcion esdecimal de la clase funciones que verifica que el dato ingresado sea un numero valido y luego lo guarda en la variable correspondiente
        fahrenheit = funciones.esdecimal("Ingrese la temperatura en grados Fahrenheit");
        if(fahrenheit==-0.0){return;}
        // realizamos la conversion
        celcius = (fahrenheit-32)*5/9;
        // limpiamos la pantalla y mostramos el resultado
        funciones.limpiar();
        System.out.println(fahrenheit + " grados fahrenheit, son:  " + celcius + " grados centigrados");
        // llamamos a la funcion continuar de la clase funciones para que el usuario pueda ver el resultado asta que presione enter
        funciones.continuar();
    }
   // funcion que resuelve la funcion Y= X*C-2
    public static void fy() throws IOException, InterruptedException
    {
        // definimos una constante para c
       final double c = 2.5;
        // definimos las variables
       double r, x;
       // pedimos los datos al usuario con la funcion esdecimal de la clase funciones que verifica que el dato ingresado sea un numero valido y luego lo guarda en la variable correspondiente
       x = funciones.esdecimal("Digite el valor de x");
       if(x==-0.0){return;}
       // calculamos y cuando x vale 1 y cuando x vale el valor ingresado por el usuario
       r=1*c-2;
       funciones.limpiar();
       System.out.println("El valor de Y cuando x=1 es: " + r);
       r=x*c-2;
       System.out.println("El valor de Y cuando x=" +x+" es: "  + r);
       funciones.continuar();
    }
   // funcion que resuelve la funcion Y= 5X^4 + 2X^3 + 3X^2 + 7
    public static void fy2() throws IOException, InterruptedException
    {
        //la funcion math.pow calcula la potencia de un numero, el resto del codigo es igual al de la funcion fy
       double r, x;
       x = funciones.esdecimal("Digite el valor de x");
       if(x==-0.0){return;}
       r= 5 + 2 + 3 + 7;
       funciones.limpiar();
       System.out.println("El valor de Y cuando x=1 es: " + r);
       r=(5* Math.pow(x, 4)) + (2* Math.pow(x, 3)) + (3* Math.pow(x, 2)) + 7;
       System.out.println("El valor de Y cuando x=" +x+" es: "  + r);
       funciones.continuar();
    }
    // esta funcion calcula la raiz cuadrada de un numero
    public static void raiz() throws IOException, InterruptedException
    {
        // la funcion math.sqrt calcula la raiz cuadrada de un numero y el resto del codigo ya fue explicado
       double r, n;
       n = funciones.esdecimal("Digite el numero del que desea la raiz cuadrada");
       if(n==-0.0){return;}
       r=Math.sqrt(n);
       funciones.limpiar();
       System.out.println("La raiz cuadrada de: " + n + " es: " + r);
       funciones.continuar();
    }
   //kilos a libras este codigo es igual al de la funcion cfc solo que se cambia la formula de conversion
    public static void ckl() throws IOException, InterruptedException {
        double k,l;
        k = funciones.esdecimal("Ingrese el peso en kilogramos");
        if(k==-0.0){return;}
        l = k*2.2;
        funciones.limpiar();
        System.out.println(k + " kilogramos equivalen a: " + l + " libras");
        funciones.continuar();
    }  
}
