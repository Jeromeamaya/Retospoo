import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombre,apellido,scadena,Ssubcadena;        
        System.out.println("ingrese el nombre");
        nombre=entrada.nextLine();
        System.out.println("ingrese el apellidos");
        apellido=entrada.nextLine();
        int length= nombre.length();
        System.out.println("La cantidad de caracteres de nombre es " + length );
        int Slength= apellido.length();
        System.out.println("la cantidad de caraxteres del apellido es" + Slength );
        System.out.println(nombre.toUpperCase());
        System.out.println(apellido.toLowerCase());
        String nombrecompleto=nombre+apellido;
        System.out.println(nombrecompleto);
        scadena= nombre;
        Ssubcadena=scadena.substring(0,2);
        System.out.println(Ssubcadena+apellido);

        





    }
    
}
