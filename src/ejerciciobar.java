import java.util.Scanner;

public class ejerciciobar {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);

    int edad;
    System.out.println("ingrese su edad");
    edad=leer.nextInt();


    if(edad>=18){
        System.out.println("bienvenido siga");
    }
    else{
            System.out.println("no puede ingresar");
        
        }
        leer.close();
        }
    }
    
