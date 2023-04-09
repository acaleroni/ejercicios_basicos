
public class App {
    public static void main(String[] args) throws Exception {
       //definimos las variables para el uso del menu
       String[] menu = {"1. Trigonometria","2. Algebra","3. Fisica","4. Salir"};
       String control="x";
        //el menu se mostrara asta que el usuario escoja salir (el while repetira el menú asta que control sea salir)
        while (control != "salir"){
            // guardamos la eleccion del usuario
            control = funciones.teclado(menu);
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
                break;
            }
        }
    }
}
