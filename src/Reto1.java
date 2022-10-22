import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        System.out.println("Reto1");
        Scanner leer=new Scanner(System.in);
        float temperatura;
        System.out.println("ingresa la temperatura deseada");
        temperatura=(float) leer.nextDouble(); 
        final double grados= (temperatura-32)/1.8;
        System.out.println("la temperatura deseada es en grados fahrenheit:"+grados);
        leer.close();

    }   
}
