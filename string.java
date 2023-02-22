import java.util.Scanner;

public class string{
      public static void main(String[]args){
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("introduce una cadena que tenga un nombre, una profesion y una nacionalidad:");
            java.lang.String datos= teclado.nextLine();
            System.out.println("entrada : "+ datos);
            java.lang.String[]arreglo =datos.split(",");
                   for(int i = 0; i < arreglo.length ; i++){
                   System.out.println("nombre:" + (arreglo[i].toUpperCase()));
                   
   
                   }
        }
    }
}