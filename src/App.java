public class App {
    public static void main(String[] args) throws Exception {
        int []numeros={ 30, 7, 12 , 5};
        MetodosOredenamiento metodosOrdenamiento=new MetodosOredenamiento() ;
        metodosOrdenamiento.sorbyBubble(numeros);
        metodosOrdenamiento.imprimir(numeros);
    }
}
