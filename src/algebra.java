import java.io.IOException;

public class algebra {
    public static void menu() throws IOException, InterruptedException 
    {
        String[] menu = {"1. Determina la funcion Y= X*C-2","2. Determina la funcion  Y= 5X^4 + 2X^3 + 3X^2 + 7","3. Raiz Cuadrada de un numero","4. Promediar Notas","5. Cosenos de un numero","6. Solucion de la forma ax + b = 0","7. Determinar el valor del determinante de segundo orden","8. Solucion de sistema de ecuasiones (Cramer)", "9. Invertir numero de 3 digitos","10. Es votante"," 11. Par o impar", "12. Menu anterior"};
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
                promedionotas();
                break;
                case "5":
                funciones.limpiar();
                coseno();
                break;
                case "6":
                funciones.limpiar();
                axb();
                break;
                case "7":
                funciones.limpiar();
                determinante();
                break;
                case "8":
                funciones.limpiar();
                cramer();
                break;
                case "9":
                funciones.limpiar();
                invertir();
                break;
                case "10":
                funciones.limpiar();
                mayor();
                break;
                case "11":
                funciones.limpiar();
                parimpar();
                break;
                case "12":
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
    //funcion que determina si un numero es par o impar
    public static void parimpar() throws IOException, InterruptedException {
        int numero;
        numero = funciones.esentero("Ingrese el numero a determinar");
        if(numero==-0){return;}
        if(numero%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        funciones.continuar();
    }
    //funcion que determina si es mayor de edad
    public static void mayor() throws IOException, InterruptedException {
        int edad;
        edad = funciones.esentero("Ingrese su edad");
        if(edad==-0){return;}
        if(edad>=16){
            System.out.println("Es votante");
        }else{
            System.out.println("Es menor de edad");
        }
        funciones.continuar();
    }
    //funcion que soluciona un sistema de ecuaciones de 2x2
    public static void cramer() throws IOException, InterruptedException {
        double a,b,c,d,e,f,x,y,determinante,determinanteX,determinanteY;
        a = funciones.esdecimal("Ingrese el valor de a");
        if(a==-0.0){return;}
        b = funciones.esdecimal("Ingrese el valor de b");
        if(b==-0.0){return;}
        c = funciones.esdecimal("Ingrese el valor de c");
        if(c==-0.0){return;}
        d = funciones.esdecimal("Ingrese el valor de d");
        if(d==-0.0){return;}
        e = funciones.esdecimal("Ingrese el valor de e");
        if(e==-0.0){return;}
        f = funciones.esdecimal("Ingrese el valor de f");
        if(f==-0.0){return;}
        determinante = (a*d)-(b*c);
        determinanteX = (e*d)-(b*f);
        determinanteY = (a*f)-(e*c);
        if(determinante==0){
            System.out.println("El sistema no tiene solucion");
            funciones.continuar();
            return;
        }
        x = determinanteX/determinante;
        y = determinanteY/determinante;
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
        funciones.continuar();
    }
    //invierte un numero de 3 digitos
    public static void invertir() throws IOException, InterruptedException {
        int numero, invertido;
        numero = funciones.esentero("Ingrese el numero de 3 digitos a invertir");
        if(numero==-0){return;}
        if(numero<100 || numero>999){
            System.out.println("El numero debe ser de 3 digitos");
            funciones.continuar();
            return;
        }
        invertido = (numero%10)*100 + ((numero/10)%10)*10 + (numero/100);
        System.out.println("El numero invertido es: " + invertido);
        funciones.continuar();
    }
    //funcion que da la determinante de una matriz de 2x2
    public static void determinante() throws IOException, InterruptedException {
        double a,b,c,d,determinante;
        a = funciones.esdecimal("Ingrese el valor de a");
        if(a==-0.0){return;}
        b = funciones.esdecimal("Ingrese el valor de b");
        if(b==-0.0){return;}
        c = funciones.esdecimal("Ingrese el valor de c");
        if(c==-0.0){return;}
        d = funciones.esdecimal("Ingrese el valor de d");
        if(d==-0.0){return;}
        determinante = (a*d)-(b*c);
        System.out.println("El determinante de la matriz es: " + determinante);
        funciones.continuar();
    }
    //funcion que resuelve la ecuacion ax + b = 0
    public static void axb() throws IOException, InterruptedException {
        double a = funciones.esdecimal("Ingrese el valor de a");
        if(a==-0.0 || a==0){return;}
        double b = funciones.esdecimal("Ingrese el valor de b");
        if(b==-0.0){return;}
        double x = -b / a;
        System.out.println("La solución lineal de ax + b = 0 es: " + x);
    }
    //funcion que calcula el coseno de un numero
    public static void coseno() throws IOException, InterruptedException {
        double numero, coseno;
        numero = funciones.esdecimal("Ingrese el numero para calcular el coseno");
        if(numero==-0.0){return;}
        coseno = Math.cos(numero);
        funciones.limpiar();
        System.out.println("El coseno de " + numero + " es: " + coseno);
        funciones.continuar();
    }
   //funcion que calcula el promedio de notas
    public static void promedionotas() throws IOException, InterruptedException {
        int n;
        n  = funciones.esentero("Ingrese el numero de notas a promediar");
        if(n==0){return;}
        double promedio, nota=0,notas[] = new double[n];
        if(n==0){return;}
        for(int i=0; i<n;i++)
        {
            if (i==0)
            {
                notas[i] = funciones.esdecimal("Ingrese la primer nota");
            }
            else if(i==n-1)
            {
                funciones.limpiar();
                notas[i] = funciones.esdecimal("Ingrese la ultima nota");
            }
            else
            {
                funciones.limpiar();
                notas[i] = funciones.esdecimal("Ingrese la siguiente nota");
                
            }
            if(notas[i]==-0.0){return;}
            nota = nota + notas[i];
        }
        funciones.limpiar();
        promedio = nota / n;
        System.out.print("El promedio de las notas: ");
        for(int i=0; i<n;i++)
        {
            if(i==n-1)
            {
                System.out.print(notas[i]);
            }
            else
            {
                System.out.print(notas[i] + ", ");
            }
        }
        System.out.println(" es: " + promedio);
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
  }
