package calebe.poo;

/**
 *
 * @author cah
 */
public class Midia {

    private int id; 
    private String titulo; 
    private String dataLancamento;
    private String dataAquisicao;
    private String nacionalidade;
    private FormatoFisico FormatoFisico; // associação

    public Midia(int id, String titulo, String dataLancamento, String dataAquisicao, String nacionalidade, FormatoFisico formatoFisico) {
        this.id = id;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.dataAquisicao = dataAquisicao;
        this.nacionalidade = nacionalidade;
        this.FormatoFisico = formatoFisico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FormatoFisico getFormatoFisico() {
        return FormatoFisico;
    }

    public void setFormatoFisico(FormatoFisico FormatoFisico) {
        this.FormatoFisico = FormatoFisico;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public void exibirInfo() {
    System.out.println("ID: " + id);
    System.out.println("Título: " + titulo);
    System.out.println("Data de Lançamento: " + dataLancamento);
    System.out.println("Data de Aquisição: " + dataAquisicao);
    System.out.println("Nacionalidade: " + nacionalidade);
    if (FormatoFisico != null) {
        FormatoFisico.exibirInfo();
    }
}

    
}
