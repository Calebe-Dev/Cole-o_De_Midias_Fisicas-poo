package calebe.poo;

import java.util.List;

/**
 *
 * @author cah
 */
public class MidiaMusical extends Midia {
    private List<String> artistas;
    private int numFaixas;
    private List<String> faixas;
    private List<String> letras;

    public MidiaMusical(List<String> artistas, int numFaixas, List<String> faixas, List<String> letras, int id, String titulo, String dataLancamento, String dataAquisicao, String nacionalidade, calebe.poo.FormatoFisico formatoFisico) {
        super(id, titulo, dataLancamento, dataAquisicao, nacionalidade, formatoFisico);
        this.artistas = artistas;
        this.numFaixas = numFaixas;
        this.faixas = faixas;
        this.letras = letras;
    }

    public List<String> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<String> artistas) {
        this.artistas = artistas;
    }

    public int getNumFaixas() {
    return faixas != null ? faixas.size() : 0;
    }


    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    public List<String> getFaixas() {
        return faixas;
    }

    public void setFaixas(List<String> faixas) {
        this.faixas = faixas;
    }

    public List<String> getLetras() {
        return letras;
    }

    public void setLetras(List<String> letras) {
        this.letras = letras;
    }
    
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método da classe mãe

      System.out.println("Artistas: " + String.join(", ", artistas));
      System.out.println("Número de Faixas: " + getNumFaixas());
    
      System.out.println("Faixas:");
      for (int i = 0; i < faixas.size(); i++) {
         System.out.println("  " + (i + 1) + ". " + faixas.get(i));
         if (letras != null && i < letras.size()) {
             System.out.println("    Letra: " + letras.get(i));
         }
    }
}

}