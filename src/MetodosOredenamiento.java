public class MetodosOredenamiento {
    ///metodo que devuelve un arreglo de enteros
    ///ordenado por burbuja
    public int [] sorbyBubble (int[]arreglo){

        ///obtener el tamano del arreglo
        int tamano=arreglo.length;

        ///bucle externo que va a recorrer todo el arreglo

        for (int i=0;i<tamano;i++){
            //Bucle for interno que compara el elemento actual con el siguiente
            for (int j=i+1;j<tamano;j++){
                int aux=0;

                if (arreglo[i]<arreglo[j]){

                    aux=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;

                }

            }
            
        }
        return arreglo;
    }
    public void imprimir(int[] arreglo){
        for (int item:arreglo){
            System.out.print(item + " ");

        }
    }
}