package Solo.Repetição;



public class Bk2 {

    public static void main(String[] args) {
        
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >=1000

        
        int valorTotal = 30000;

        

        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            
            if (valorParcela >= 1000) {
                System.out.println("Parcela : "+ parcela+ " R$ "+ valorParcela);
            }else{
                break;
            }

            // if (valorParcela < 1000) {
            //     break;
                
            // }
            // System.out.println("Parcela: "+ parcela+ " R$ "+ valorParcela);
        }

        


    }
    
}
