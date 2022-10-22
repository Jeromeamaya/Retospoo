import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in); 
        
        int precio,cantidad,op,subtotal=0,pago;
        double bolaroja=1,bolaazul=2,bolaamarilla=3,bolablanca=4,total1=subtotal*0.10,total2=subtotal*0.30,total3=subtotal*0.50;
        int bola = (int)(Math.random()*4+1);
            System.out.println("si desea registrar  otro producto presione \n 1. si \n 2. no");
            op=entrada.nextInt();
            if (op== 1){
                while (op== 1 ){
                    System.out.println("digite el precio del producto");
                    precio= entrada.nextInt();
                    System.out.println("digite la cantidad del producto"); 
                    cantidad= entrada.nextInt();
                    System.out.println("si desea registrar  otro producto presione \n 1. si \n 2. no");
                    op=entrada.nextInt();   
                    subtotal+=precio*cantidad;            
                if (op== 2){
                    System.out.println("gracias por su compra"); 
                    System.out.println("el valor de la compra es "+subtotal);
                    if (bola==bolaroja){
                        System.out.println("felicitaciones salio bola roja");
                        System.out.println("tienes descuento del 10%");
                        System.out.println("felicitaciones tu descuento es "+subtotal*0.10);
                        total1=subtotal-subtotal*0.10;
                        System.out.println("el valor apagar es " + total1);
                            System.out.println("cliente paga con ");
                        pago=entrada.nextInt();
                        System.out.println("su cambio es "+(pago -total1));
                    }
                    else if (bola==bolaazul){
                        System.out.println("felicitaciones salio bola azul");
                        System.out.println("tienes descuento del 30%");
                        System.out.println("felicitaciones tu descuento es "+subtotal*0.30);
                        total2=subtotal-subtotal*0.30;
                        System.out.println("el valor apagar es " + total2);
                        System.out.println("cliente paga con ");
                        pago=entrada.nextInt();
                        System.out.println("su cambio es "+(pago-total2));
                    }
                    else if (bola==bolaamarilla){
                        System.out.println("felicitaciones salio bola amarilla");
                        System.out.println("tienes descuento del 50%");
                        System.out.println("felicitaciones tu descuento es "+subtotal*0.50);
                        total3=subtotal-subtotal*0.50;
                        System.out.println("el valor apagar es " + total3);
                        System.out.println("cliente paga con ");
                        pago=entrada.nextInt();
                        System.out.println("su cambio es "+ (pago  -total3));
                    }
                    else if (bola==bolablanca){
                        System.out.println("felicitaciones salio bola blanca");
                        System.out.println("tienes descuento del 100%");
                        System.out.println("felicitaciones tu compra salio gratis");
                        
                    }
                }   
            }   
        }
    }                
}

    


        

