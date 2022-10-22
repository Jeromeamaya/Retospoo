import java.util.Scanner;

public class Ejercicio4talleres {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        float nota=0,notaf=0;
        
        for (int i=1; i< 5; i++)
       {
        System.out.println("digite la nota del taller");
        nota = leer.nextFloat();
        notaf=notaf+nota;

    }
        System.out.println("el promedio de la notal final es " +notaf / 4 );
        if (nota>=0.0 && nota<=2.9){
            System.out.println("Reprobaste la asignatura");   
        }
        else if (nota>=3.0 && nota<=4.0){
            System.out.println("Pasaste raspando la asignatura");   
        }
        else if(nota >=4.0){
            System.out.println("Aprobaste");
        }
        
            
    
    

    }
}