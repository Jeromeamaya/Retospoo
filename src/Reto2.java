import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int meses,peso,dosis;
        System.out.println("ingrese la edad del Infante");
        meses=entrada.nextInt();
        System.out.println("ingrese el peso del Infante");
        peso=entrada.nextInt();
        dosis=(peso+10/meses*10)*8;
        System.out.println("la Dosis aplicar es " + dosis );
    }
}
