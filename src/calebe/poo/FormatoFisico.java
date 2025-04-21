package calebe.poo;
/**
 *
 * @author cah
 */
public class FormatoFisico {
    
    private String nome;
    private double duracao;
    private String observacoes;
    private String conservacao;
    String tipo;

    public FormatoFisico(String nome, double duracao, String observacoes, String conservacao, String tipo) {
        this.nome = nome;
        this.duracao = duracao;
        this.observacoes = observacoes;
        this.conservacao = conservacao;
        this.tipo = tipo;
    }

    
    
    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void exibirInfo() {
    System.out.println("Nome: " + nome);
    System.out.println("Duração: " + duracao + " min");
    System.out.println("Observações: " + observacoes);
    System.out.println("Conservação: " + conservacao);
    System.out.println("Tipo: " + tipo);
}

    

}