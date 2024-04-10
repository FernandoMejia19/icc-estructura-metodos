import java.util.Scanner;
public class MetodosOredenamiento {
    
    ///metodo que devuelve un arreglo de enteros
    ///ordenado por burbuja
    public int[] sorbyBubble (int[]arreglo,boolean logs){

        ///obtener el tamano del arreglo
        System.out.println("SI DESEA IMPRIMIR EL PROECESO DIGITE 1\nSI NO DESEA IMRIMIR EL RESULTADO DIGITE 0 ");
        Scanner leer=new Scanner (System.in);
        int preg;
        preg=leer.nextInt();
        if (preg==1){
            logs=true;
        }
        else if (preg==0){
            logs=false;

        }
        int tamano=arreglo.length;

        ///bucle externo que va a recorrer todo el arreglo

        for (int i=0;i<tamano;i++){
            //Bucle for interno que compara el elemento actual con el siguiente
            if (logs){
                System.out.println("\n Pasada numero "+i);
            }
            for (int j=i+1;j<tamano;j++){
                if (logs){
                    System.out.println("i=  "+arreglo[i]+"  j= "+arreglo[j]);
                }
                int aux=0;

                if (arreglo[i]>arreglo[j]){
                    if (logs){
                        System.out.println("Si es mayor asi que cambio ");
                    }

                    aux=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                    if (logs){
                        System.out.println(" ");
                        imprimir(arreglo);
                    }

                }

            }
            
        }
        return arreglo;
        
    }
    public void imprimir(int[] arreglo){
        for (int item:arreglo){
            System.out.print(item + " ");

        }
        System.out.println(" ");
    }
    /* 
    public void Preguntar(String []preg){
        Scanner leer=new Scanner (System.in);
        preg=leer.nextLine();


    }*/
}