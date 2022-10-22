import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) throws Exception{
        Scanner entrada=new Scanner(System.in); 
        int op,num1,num2,total;
        String user1,contraseña1;
        System.out.println("ingrese el usuario");
        user1=entrada.nextLine();
        System.out.println("ingrese la contraseña");
        contraseña1=entrada.nextLine();

        if (user1.equalsIgnoreCase("jfajardo") && contraseña1.equals("12345678#")){
            System.out.println("Menu de opciones \n 1.suma \n 2.resta \n 3.Multipliacion \n 4.division \n 5. potenciacion \n 6. raiz cuadrada \n Ingrese el numero de la opcion que desea realizar"); 
            op=entrada.nextInt();
            System.out.println("ingrese el numero 1");
            num1=entrada.nextInt();
            System.out.println("ingrese el numero 2");
            num2=entrada.nextInt();
            switch(op){
                case 1:
                    total=num1+num2;
                    System.out.println("el resultado de la suma de "+total);
                break;
                case 2:
                    total=num1-num2;
                    System.out.println("el resultadodo de la resta de "+total);
                break;
                case 3:
                    total=num1*num2;
                    System.out.println("el resultado de la multiplicacion de "+total);
                break;
                case 4:
                    total=num1/num2;
                    System.out.println("el resultado de la division  es"+total);
                break;

                default:
                break;
            }
        }
        else if (user1.equalsIgnoreCase("jfajardo") && contraseña1!=("12345678#")){ 
            System.out.println("la contraseña ingresada es incorrecta");
            
        }
        else if (user1!=("jfajardo") && contraseña1.equals("12345678#")){ 
            System.out.println("el usuario no existe, no esta registrado");
        
        }
        else if (user1!=("jfajardo") && contraseña1!=("12345678#")){ 
            System.out.println("las credenciales ingresadas son incorrectas");
        
        } 
}
}   
