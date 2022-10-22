import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    int apuesta=100000;
    int opcion,apuesta1=0,cont=1,acum=0;
    String op;
    double cara=1, sello=2;
        System.out.println("desea inicar el juego presione  \n s.  si \n n. no");
        op=entrada.nextLine();
        
        if (op.equals("s")){
            entrada.nextLine();
            while (op.equals("s")){
                
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
                        System.out.println("desea inicar el juego tu apuesta va doble  \n s.  si \n n. no");
                        
                        op=entrada.nextLine();
                        entrada.nextLine();
                    }
                else if (moneda==cara && opcion==2){
                    System.out.println("Perdiste" +cara );
                    apuesta=apuesta-apuesta1;
                    System.out.println(">Su saldo actual es " + apuesta);
                    System.out.println("Desea inicar el juego presione   \n s.  si \n n. no");
                    op=entrada.nextLine();
                    entrada.nextLine();
                    
                    }
                else if (moneda==sello && opcion==2){
                    System.out.println("felicitaciones" +sello+ "ganaste");
                        apuesta+=apuesta1;
                        System.out.println("au saldo actual es " + apuesta);
                        System.out.println("desea inicar el juego tu apuesta va doble  \n s.  si \n n. no");
                        op=entrada.nextLine();
                        entrada.nextLine();
                        
                    }
                else if (moneda==sello && opcion==1){
                    System.out.println("Perdiste" +sello );
                    apuesta=apuesta-apuesta1;
                    System.out.println("Su saldo actual es " + apuesta);
                    System.out.println("desea inicar el juego presione   \n s.  si \n n. no");
                    op=entrada.nextLine();
                    entrada.nextLine();
                    
                    }
                
            }
        }
        else if (op.equals("n")){
            System.out.println("gracias por participar");            
        }
    }
}
