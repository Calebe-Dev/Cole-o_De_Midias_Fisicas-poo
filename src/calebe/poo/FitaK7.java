package calebe.poo;

import java.util.List;

/**
 *
 * @author cah
 */
public class FitaK7 extends FormatoFisico{
    private int faixasLadoA;
    private int faixasLadoB;
    private List<String> ladoA;
    private List<String> ladoB;

    public FitaK7(int faixasLadoA, int faixasLadoB, List<String> ladoA, List<String> ladoB, String nome, double duracao, String observacoes, String conservacao, String tipo) {
        super(nome, duracao, observacoes, conservacao, "Fita K7");
        this.faixasLadoA = faixasLadoA;
        this.faixasLadoB = faixasLadoB;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }




    public int getFaixasLadoA() {
        return faixasLadoA;
    }

    public void setFaixasLadoA(int faixasLadoA) {
        this.faixasLadoA = faixasLadoA;
    }

    public int getFaixasLadoB() {
        return faixasLadoB;
    }

    public void setFaixasLadoB(int faixasLadoB) {
        this.faixasLadoB = faixasLadoB;
    }

    public List<String> getLadoA() {
        return ladoA;
    }

    public void setLadoA(List<String> ladoA) {
        this.ladoA = ladoA;
    }

    public List<String> getLadoB() {
        return ladoB;
    }

    public void setLadoB(List<String> ladoB) {
        this.ladoB = ladoB;
    }

    
    
    @Override
    public void exibirInfo() {
      super.exibirInfo();

      System.out.println("Faixas Lado A:");
      for (int i = 0; i < ladoA.size(); i++) {
          System.out.println("  " + (i + 1) + ". " + ladoA.get(i));
      }

      System.out.println("Faixas Lado B:");
      for (int i = 0; i < ladoB.size(); i++) {
          System.out.println("  " + (i + 1) + ". " + ladoB.get(i));
      }
}

}