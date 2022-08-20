import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;

        do{
            System.out.println("Seleccione al número de la opción deseada");
            System.out.println("Seleccionada");
            System.out.println("1. Movies ");
            System.out.println("Series");
            System.out.println("Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Seleccione una opcion correcta");
            } do(response != 0);

        }
    }
}
