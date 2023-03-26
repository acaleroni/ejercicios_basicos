import java.util.Scanner;

public class App {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       //definimos las variables para el uso del menu
        String control="x";
        //el menu se mostrara asta que el usuario escoja salir (el while repetira el menú asta que control sea salir)
        while (control != "salir"){
            //limpiamos la pantalla y mostramos el menu
            funciones.limpiar();  
            System.out.println("1. Trigonometria");
            System.out.println("2. Algebra");
            System.out.println("3. Fisica");
            System.out.println("4. Salir");
            // guardamos la eleccion del usuario
            control = teclado.nextLine();
            switch (control){
                //ejecutamos una opcion segun la seleccion
                case "1":
                //llama la funcion menu de la clase trigonometria
                    trigonometria.menu();
                break;
                case "2":
                //llama la funcion menu de la clase algebra
                   algebra.menu();
                break;
                case "3":
                //llama la funcion menu de la clase algebra
                   fisica.menu();
                break;
                case "4":
                    //limpiamos la pantalla
                   funciones.limpiar();
                   control = funciones.salir();
                break;
                default:
                //limpiamos la pantalla
                    funciones.limpiar();
                    //mostramos un mensaje de error
                    System.out.println("La obción " + control + " no es valida por favor ingrese una obción valida");
                    funciones.continuar();
                    teclado.nextLine();
                break;
            }
        }
        //cerramos el teclado para evitar over bufering
        teclado.close();
    }
}
