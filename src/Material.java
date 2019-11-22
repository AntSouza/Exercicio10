public class Material {
    private String nome;
    private int quantidade;
    
    public Material(String n, int q)throws QuantidadeInvalidaException{
        this.setNome(n);
        this.setQuantidade(q);
    }
    
    public final void setNome(String n){
        this.nome = n;
        
    }
    public String getNome(){
        return this.nome;
            } 
    
    public final void setQuantidade(int q) throws QuantidadeInvalidaException{        
        if(q < 0){
            throw new QuantidadeInvalidaException("Quantidade invalida!");
        }
        this.quantidade = q;
    }
    public double getQuantidade(){
        return this.quantidade;
    }
}
