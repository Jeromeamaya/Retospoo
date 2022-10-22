import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    int apuesta=100000;
    int op,opcion,apuesta1=0,cont=1;
    double cara=1, sello=2;
        System.out.println("desea inicar el juego presione  \n 1.  si \n 2. no");
        op=entrada.nextInt();        
        if (op==1){
            
            while (op==1){
                
                    System.out.println("escoga la opcion que desea \n 1.cara \n 2. sello ");
                    opcion= entrada.nextInt();
                    System.out.println("digite la cantidad que desea apostar ");
                    apuesta1= entrada.nextInt();
                    cont=cont+1;
        
                    int moneda = (int)(Math.random()*2+1);
                if (moneda==cara && opcion==1){
                        System.out.println(" felicitaciones " + cara + "ganaste");
                        apuesta+=(apuesta1*2);
                        System.out.println("su saldo actual es " + apuesta);
                        System.out.println("desea inicar el juego tu apuesta va doble  \n 1.  si \n 2. no");
                        op=entrada.nextInt();
                        
                    }
                else if (moneda==cara && opcion==2){
                    System.out.println("Perdiste" +cara );
                    apuesta=apuesta-apuesta1;
                    System.out.println(">Su saldo actual es " + apuesta);
                    System.out.println("Desea inicar el juego presione   \n 1.  si \n 2. no");
                    op=entrada.nextInt();
                    }
                else if (moneda==sello && opcion==2){
                    System.out.println("felicitaciones" +sello+ "ganaste");
                        apuesta+=apuesta1;
                        System.out.println("au saldo actual es " + apuesta);
                        System.out.println("desea inicar el juego tu apuesta va doble  \n 1.  si \n 2. no");
                        op=entrada.nextInt();
                        
                    }
                else if (moneda==sello && opcion==1){
                    System.out.println("Perdiste" +sello );
                    apuesta=apuesta-apuesta1;
                    System.out.println("Su saldo actual es " + apuesta);
                    System.out.println("desea inicar el juego presione   \n 1.  si \n 2. no");
                    op=entrada.nextInt();
                    }
                
            }
        }
        else if (op==2){
            System.out.println("gracias por participar");            
        }
    }
}