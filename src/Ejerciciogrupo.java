import java.util.Scanner;

public class Ejerciciogrupo {
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in) ;
       int hombre=0,mujer=0,opcion=0;
        
       for (int i=0; i< 10; i++)
       {
        System.out.println("es un hombre digite \n 1.hombre \n 2.mujer");
        opcion= entrada.nextInt();

            if (opcion==1){
            hombre=hombre+1;
        }
            else if (opcion==2){
            mujer=mujer+1;
        }   
       }
       
    System.out.println("la cantidad de hombres es "+hombre);
    System.out.println("la cantidad de mujeres es "+mujer);

    }
        
}
