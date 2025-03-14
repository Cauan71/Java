public class Ex_Array {
    public static void main(String[] args) {
        int [] Array={1,2,3,4};
        int indice = 2;

    try {
        System.out.println("Elemento no Índice( "+ indice+ " ) é: "+Array[indice]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Elemento não está no Índice!");
    }finally{
        System.out.println("Finalizando.....");
    }
    }
}
