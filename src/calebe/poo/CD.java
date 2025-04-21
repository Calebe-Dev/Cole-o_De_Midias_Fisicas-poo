package calebe.poo;

/**
 *
 * @author cah
 */
public class CD extends FormatoFisico{
    private boolean possuiEncarte;
    private double capacidade;

    public CD(boolean possuiEncarte, double capacicade, String nome, double duracao, String observacoes, String conservacao, String tipo) {
        super(nome, duracao, observacoes, conservacao, "CD");
        this.possuiEncarte = possuiEncarte;
        this.capacidade = capacicade;
    }

    public boolean isPossuiEncarte() {
        return possuiEncarte;
    }

    public void setPossuiEncarte(boolean possuiEncarte) {
        this.possuiEncarte = possuiEncarte;
    }

    public double getCapacicade() {
        return capacidade;
    }

    public void setCapacicade(double capacicade) {
        this.capacidade = capacicade;
    }
    

    @Override
    public void exibirInfo() {
      super.exibirInfo();
      System.out.println("Possui Encarte: " + (possuiEncarte ? "Sim" : "Não"));
       System.out.println("Capacidade: " + capacidade + " MB");
    }

}