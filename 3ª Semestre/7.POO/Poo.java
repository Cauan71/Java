public class Poo {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Iuri", "444");
        System.out.println("Nome: "+ p1.getNome()+ "Telefone: "+ p1.getTelefone());
        p1.setNome("neymar");
        
        System.out.println("O novo nome é: "+ p1.getNome()+ "\n Telefone: "+ p1.getTelefone());

        Pessoa p2 = new Pessoa("Carlos", "333");

        System.out.println("Nome: "+p2.getNome()+ "Telefone: "+ p2.getTelefone());
    }
}