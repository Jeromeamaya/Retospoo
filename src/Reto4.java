import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion = (int) (Math.random()*3);
        double tijera=2,piedra=1,papel=3;
        int op;
            System.out.println("por favor escoga la opcion deseada \n 1.tijera \n 2.piedra \n 3. papel");
            op=entrada.nextInt();
            if (op== piedra && opcion== 2){
                System.out.println("ganaste");
            }
            else if (op== tijera && opcion==3){
                System.out.println("ganaste");
            }
            else if (op== papel && opcion==2){
                System.out.println("perdiste");
            }
            else if (op== tijera && opcion==1){
                System.out.println("perdiste");
            }
            else if (op== papel && opcion==2){
                System.out.println("perdiste");
            }
            else if (op==opcion){
                System.out.println("empate");
            }

    }
    
}
