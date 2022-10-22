import java.util.Scanner;
public class Ejercicioexito {
 
    public static void main(String[] args) throws Exception{
        Scanner entrada=new Scanner(System.in); 
        int precio,cantidad,referencia=0,subt,total=0,pago=0,op;

        for (int i=0; i< 5; i++ )
        {
            System.out.println("digite el precio del producto");
            precio= entrada.nextInt();
            System.out.println("digite la cantidad del producto"); 
            cantidad= entrada.nextInt();
            subt=precio*cantidad;
            System.out.println(cantidad+ "del producto de precio" +precio+ "es" +subt );
            // iniciar contador//
            referencia=referencia+1;
            // iniciar acumulador//
            total=total+subt;
            
        }
        System.out.println("el total de su compra es"+total);
        System.out.println("la cantidad de minutos es igual "+referencia);
        System.out.println("va pagar con un billete de");
        pago=entrada.nextInt();
        System.out.println("su cambio es "+(pago-total));
        System.out.println("cuenta usted con movil exito  digite \n 1.si \n 2.no");
        op=entrada.nextInt();
        System.out.println("la cantidad de minutos es igual "+referencia);



        entrada.close();
 }

}

