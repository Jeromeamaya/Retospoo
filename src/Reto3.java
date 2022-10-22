
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int moneda = (int)(Math.random()*2+1);
        
        double op,cara=1,sello=2;
            System.out.println("por favor elija \n 1. cara \n 2. sello");
            op=entrada.nextDouble();
            if (moneda==1 && op==1){
                System.out.println("felicitaciones salio "+cara+ "ganaste");     
            }
            else if (moneda==1 && op==2) {
                System.out.println("Lo lamento  salio " + cara + "perdiste" );
            }
            else if (moneda==2 && op==1){
                System.out.println("Lo lamento  salio " + sello + "perdiste" );
            }
            else if (moneda==2 && op== 2){
                System.out.println("felicitaciones salio "+sello+ "ganaste");
            }


    }



    
}
