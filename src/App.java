///import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        int []numeros={ 30, 7, 12 , 5};
        MetodosOredenamiento metodosOrdenamiento=new MetodosOredenamiento() ;
        /*String preg;
        Scanner leer=new Scanner (System.in);
        preg=leer.nextLine();*/
        metodosOrdenamiento.imprimir(numeros);
        metodosOrdenamiento.sorbyBubble(numeros,false);
        metodosOrdenamiento.imprimir(numeros);
    }
}
