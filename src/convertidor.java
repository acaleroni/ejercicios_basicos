import java.io.IOException;

public class convertidor {
    public static void menu() throws IOException, InterruptedException{
        //definimos las variables para el uso del menu
        String[] menu = {"1. Convertir temperatura","2. Convertir peso","3. Convertir longitud","4. Salir"};
        String control="x";
        //el menu se mostrara asta que el usuario escoja salir (el while repetira el menú asta que control sea salir)
        while (control != "salir"){
            // guardamos la eleccion del usuario
            control = funciones.teclado(menu);
            switch (control){
                //ejecutamos una opcion segun la seleccion
                case "1":
                funciones.limpiar();
                ct();
                break;
                case "2":
                funciones.limpiar();
                cp();
                break;
                case "3":
                funciones.limpiar();
                cl();
                break;
                case "4":
                   control = "salir";
                break;
                default:
                //limpiamos la pantalla
                    funciones.limpiar();
                    //mostramos un mensaje de error
                    System.out.println("La obción " + control + " no es valida por favor ingrese una obción valida");
                    funciones.continuar();
                break;
            }
        }
    }
    //funcion que convierte longitud de yardas, pies, pulgadas y centimetros
    private static void cl() throws IOException, InterruptedException {
    String[] medida = {"1. Convertir desde Yardas","2. Convertir desde Pies","3. Convertir desde Pulgadas ","4. Convertir desde Centimetros","5. Salir"};
    String ctl = funciones.teclado(medida);
    int selec = Integer.parseInt(ctl);
    double yardas, pies, pulgadas, centimetros;
    if (selec!=5){
        if(selec==1){
        yardas = funciones.esdecimal("Ingrese la longitud en yardas");
        if(yardas==-0.0){return;}
        funciones.limpiar();
        System.out.println(yardas + " yardas son: "+ yardas*3 + "pies, " + yardas*36 + "pulgadas, " + yardas*91.44 + "centimetros");
        }else if(selec==2){
        pies = funciones.esdecimal("Ingrese la longitud en pies");
        if(pies==-0.0){return;}
        funciones.limpiar();
        System.out.println(pies + " pies son: " + pies*0.333333 + "yardas, " + pies*12 + "pulgadas, " + pies*30.48 + "centimetros");
        }else if(selec==3){
        pulgadas = funciones.esdecimal("Ingrese la longitud en pulgadas");
        if(pulgadas==-0.0){return;}
        funciones.limpiar();
        System.out.println(pulgadas + " pulgadas son: " + pulgadas*0.0277778 + "yardas, " + pulgadas*0.0833333 + "pies, " + pulgadas*2.54 + "centimetros");
        }else if(selec==4){
        centimetros = funciones.esdecimal("Ingrese la longitud en centimetros");
        if(centimetros==-0.0){return;}
        funciones.limpiar();
        System.out.println(centimetros + " centimetros son: " + centimetros*0.0109361 + "yardas, " + centimetros*0.0328084 + "pies, " + centimetros*0.393701 + "pulgadas");
        }else{
        funciones.limpiar();
        System.out.println("La obción " + ctl + " no es valida");
        }    
    } 
    funciones.continuar();
    }
    // funcion que convierte grados temeperatura de fahrenheit a celcius y viceversa
    private static void ct() throws IOException, InterruptedException {
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
    //pesos, este codigo es igual al de la funcion ct solo que se cambia la formula de conversion
    public static void cp() throws IOException, InterruptedException {
        double k,l;
        k = funciones.esdecimal("Ingrese el peso en kilogramos");
        if(k==-0.0){return;}
        l = k*2.2;
        funciones.limpiar();
        System.out.println(k + " kilogramos equivalen a: " + l + " libras");
        funciones.continuar();
    }  
}
