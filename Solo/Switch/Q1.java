package Solo.Switch;

public class Q1 {
    public static void main(String[] args) {
        // Dados os valores, imprima de 1 a 7 se é dia útil ou final de semana

        int dias = 7;

        switch (dias) {
            case 1:
                System.out.println("Domingo: Final de Semana");
                break;

            case 2:
                System.out.println("Segunda: Dia útil");
                break;

            case 3:
                System.out.println("Terça - Dia útil");
                break;

            case 4:
                System.out.println("Quarta - Dia útil");
                break;

            case 5:
                System.out.println("Quinta - Dia útil");
                break;

            case 6:
                System.out.println("Sexta - Dia útil");
                break;

            case 7:
                System.out.println("Sabado: Final de Semana");
                break;

        
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
    
}
