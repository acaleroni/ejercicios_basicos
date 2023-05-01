import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
      String seleccion="x";
      while(seleccion != "salir"){
        funciones.limpiar();
        String[] menu = {"1. Segun Lista","2. Por categoria","3. Salir"};
        seleccion = funciones.teclado(menu);
        switch(seleccion){
          case "1":
            ordenado();
          break;
          case "2":
            categorias();
          break;
          case "3":
          funciones.limpiar();
          String mensaje[] = {"¿Seguro que desea salir? si/no"};
          seleccion = funciones.teclado(mensaje);
          seleccion = seleccion.toLowerCase();  
          if(seleccion.equals("si")){
                 seleccion = "salir";
                 funciones.limpiar();
                 System.out.println("Gracias por usar nuestro sistema");
            }
          break;
          default:
            funciones.limpiar();
            System.out.println("La obción " + seleccion + " no es valida por favor ingrese una obción valida");
            funciones.continuar();
          break;
        }
      }
    }
    private static void ordenado() throws IOException, InterruptedException{
      String[] menu = {"1. Del 1 al 10","2. Del 11 al 20","3. Del 21 al 30","4. Del 31 al 40","5. Del 41 al 50","6. Del 51 al 60","7. Menu anterior"};
      String control="x";
      while (control != "salir"){
        control = funciones.teclado(menu);
        switch (control){
          case "1":
          String menu1[] = {"1. Area de un rectangulo","2. Perimetro y Area de un circulo","3.Determina la funcion Y= X*C-2","4. Raiz Cuadrada de un numero","5. Determina la funcion  Y= 5X^4 + 2X^3 + 3X^2 + 7","6. Convertir peso","7. Convertir temperatura", "8. Area de un triangulo (Segun sus lados)","9. Volumen de un cilindro",  "10. Fuerza de un cuerpo", "11. Menu anterior"};
          String control1 = "x";
          while (control1 != "salir"){
            control1 = funciones.teclado(menu1);
            switch (control1){
              case "1":
              funciones.limpiar();
              trigonometria.area_rectangulo();
              break;
              case "2":
              funciones.limpiar();
              trigonometria.pa_circ();
              break;
              case "3":
              funciones.limpiar();
              algebra.fy();
              break;
              case "4":
              funciones.limpiar();
              algebra.raiz();
              break;
              case "5":
              funciones.limpiar();
              algebra.fy2();
              break;
              case "6":
              funciones.limpiar();
              convertidor.cp();
              break;
              case "7":
              funciones.limpiar();
              convertidor.ct();
              break;
              case "8":
              funciones.limpiar();
              trigonometria.area_triangulo_lados();
              case "9":
              funciones.limpiar();
              trigonometria.vol_cilindro();
              break;
              case "10":
              funciones.limpiar();
              fisica.Fuerza_cuerpo();
              break;
              case "11":
              control1 = "salir";
              break;
              default:
              funciones.limpiar();
              System.out.println("La obción " + control1 + " no es valida por favor ingrese una obción valida");
              funciones.continuar();
              break;
            }
          }
          break;
          case "2":
             String menu2[] = {"1. Coseno de un numero","2. Promediar Notas","3. Convertir longitud","4. Solucion de la forma ax + b = 0","5. Determinar el valor del determinante de segundo orden","6. Solucion de sistema de ecuasiones (Cramer)","7. Energia total de un cuerpo", "8. Invertir numero de 3 digitos","9. Es votante",  "10. Par o Impar", "11. Menu anterior"};
          String control2 = "x";
          while (control2 != "salir"){
            control2 = funciones.teclado(menu2);
            switch (control2){
              case "1":
              funciones.limpiar();
              algebra.coseno();
              break;
              case "2":
              funciones.limpiar();
              algebra.promedionotas();
              break;
              case "3":
              funciones.limpiar();
              convertidor.cl();
              break;
              case "4":
              funciones.limpiar();
              algebra.axb();
              break;
              case "5":
              funciones.limpiar();
              algebra.determinante();
              break;
              case "6":
              funciones.limpiar();
              algebra.cramer();
              break;
              case "7":
              funciones.limpiar();
              fisica.Energia_cuerpo();
              break;
              case "8":
              funciones.limpiar();
              algebra.invertir();
              case "9":
              funciones.limpiar();
              algebra.mayor();  
              break;
              case "10":
              funciones.limpiar();
              algebra.parimpar();
              break;
              case "11":
              control2 = "salir";
              break;
              default:
              funciones.limpiar();
              System.out.println("La obción " + control2 + " no es valida por favor ingrese una obción valida");
              funciones.continuar();
              break;
            }
          }
          break;
          case "3":
              String menu3[] = {"1. Potencia de X","2. Interes de capital","3. Aprobado o Reprobado","4. Y cuando valor es positivo o negativo","5. Determinar si un numero es divisible entre 3","6. Determinar si un numero es primo o compuesto","7. Determinar si un numero es positivo o negativo", "8. Determinar si un numero es mayor o menor que otro","9. Determinar si un numero es multiplo de 5",  "10. Determinar si un numero es multiplo de 10", "11. Menu anterior"};
          String control3 = "x";
          while (control3 != "salir"){
            control3 = funciones.teclado(menu3);
            switch (control3){
              case "1":
              funciones.limpiar();
              algebra.potenciax();
              break;
              case "2":
              funciones.limpiar();
              algebra.interes();
              break;
              case "3":
              funciones.limpiar();
              algebra.aprobado();
              break;
              case "4":
              funciones.limpiar();
              algebra.positivo();
              break;
              case "5":
              funciones.limpiar();
              algebra.divisible3();
              break;
              case "6":
              funciones.limpiar();

              break;
              case "7":
              funciones.limpiar();

              break;
              case "8":
              funciones.limpiar();

              case "9":
              funciones.limpiar();

              break;
              case "10":
              funciones.limpiar();
              
              break;
              case "11":
              control3 = "salir";
              break;
              default:
              funciones.limpiar();
              System.out.println("La obción " + control3 + " no es valida por favor ingrese una obción valida");
              funciones.continuar();
              break;
            }
          }
          break;
          case "4":
          control = "salir";
          break;
          case "5":
           control = "salir";
          case "6":
          control = "salir";
          break;
          case "7":
           control = "salir";
          break;
          case "8":
          control = "salir";
          break;
          case "9":
          control = "salir";
          break;
          case "10":
          control = "salir";
          break;
          case "11":
          control = "salir";
          break;
          default:
            funciones.limpiar();
            System.out.println("La obción " + control + " no es valida por favor ingrese una obción valida");
            funciones.continuar();
          break;
        }
      }
    }
    private static void categorias() throws IOException, InterruptedException{
         //definimos las variables para el uso del menu
       String[] menu = {"1. Trigonometria","2. Algebra","3. Fisica","4. Convertidores","5. Menu anterior"};
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
                //llama la funcion menu de la clase algebra
                   convertidor.menu();
                break;
                case "5":
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
}
