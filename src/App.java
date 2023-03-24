import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //definimos las variables para el uso del menu
        String control="x";
        Scanner teclado = new Scanner(System.in);
        //el menu se mostrara asta que el usuario escoja salir (el while repetira el menú asta que control sea salir)
        while (control != "salir"){
            //limpiamos la pantalla
            funciones.limpiar();   
            //mostramos el menu    
            System.out.println("1. Trigonometria");
            System.out.println("2. Algebra");
            System.out.println("3. Salir");
            // guardamos la eleccion del usuario
            control = teclado.nextLine();
            switch (control){
                //ejecutamos una opcion segun la seleccion
                case "1":
                    trigonometria.menu();
                break;
                case "2":
                   algebra.menu();
                break;
                case "3":
                    funciones.limpiar();
                    control = funciones.salir();
                break;
                default:
                    funciones.limpiar();
                    System.out.println("Obción no valida");
                break;
            }
        }
        teclado.close();
    }
}
