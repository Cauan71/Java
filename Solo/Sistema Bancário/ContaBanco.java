public class ContaBanco {
    private String titular;
    private float saldo;
    private Integer senha;
        
        
        public ContaBanco(String titular, Integer senha){
            this.titular = titular;
            this.saldo = (float) 0.0;
            this.senha = senha;
    }

private boolean verificarSenha(Integer senhaDigitada){
    return this.senha.equals(senhaDigitada);
}
    
public String getTitular(){
    return titular;
}

    
public void depositar(float valor){
    if (verificarSenha(senha)) {
        
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ "+valor+" realizado com Sucesso!! ");
            
        }else{
            System.out.println("Valor Inválido para Depósito");
        }
    }
    
}
 public void Saque(float valor){
    if (verificarSenha(senha)) {
        
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ "+valor+" Realizado com Sucesso! ");
            
            
        }else if (valor > saldo) {
            System.out.println("Saldo Insuficiente!! ");
            
        }else{
            System.out.println("Valor Inválido para Saque");
        }
    }
}
    
public void exibirSaldo(){
    if (verificarSenha(senha)) {
        
        System.out.println("Titular: "+ titular);
        System.out.println("Saldo: R$"+ saldo);
        
        
    }
}

}
