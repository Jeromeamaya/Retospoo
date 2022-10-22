package secuenciales;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
        //definir un Objeto;//
        Scanner leer=new Scanner(System.in );

        

        //datos de entrada//
        final double PI=3.1416;
        double radio,area;

        System.out.println("Ingrese el radio del círculo");
        radio=leer.nextDouble();



        // procesar informacion //
        area= PI*radio*radio;


        //salida//
        System.out.println("el area del circulo con radio es " +area );
        leer.close();


    }

}
