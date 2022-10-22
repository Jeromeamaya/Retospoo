import java.util.Scanner;
public class Ejerciciofor {
    public static void main(String[] args) throws Exception{
        Scanner entrada=new Scanner(System.in); 
        int precio,cantidad;

        for (int i=0; i< 5; i++ )
        {
            System.out.println("digite el precio del producto");
            precio= entrada.nextInt();
            System.out.println("digite la cantidad del producto"); 
            cantidad= entrada.nextInt();


        }
        entrada.close();
 }

}