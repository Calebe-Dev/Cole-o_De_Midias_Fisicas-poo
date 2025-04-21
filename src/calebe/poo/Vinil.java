package calebe.poo;

import java.util.List;

/**
 *
 * @author cah
 */
public class Vinil extends FormatoFisico {

    private List<String> ladoA;
    private List<String> ladoB;

    public Vinil(List<String> ladoA, List<String> ladoB, String nome, double duracao, String observacoes, String conservacao) {
        super(nome, duracao, observacoes, conservacao, "Vinil");
        this.ladoA = ladoA;
        this.ladoB = ladoB;
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
