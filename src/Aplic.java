package calebe.poo;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author cah
 */
public class Aplic {

    public static void main(String[] args) {

        // Passo 1: Criar listas com faixas do Lado A e Lado B do vinil
        List<String> ladoA = Arrays.asList(
            "Intro",
            "Primeira Música",
            "Segunda Música"
        );

        List<String> ladoB = Arrays.asList(
            "Terceira Música",
            "Quarta Música",
            "Encerramento"
        );

        // Passo 2: Criar o objeto Vinil com os dados do formato físico
        Vinil vinil = new Vinil(
            ladoA,
            ladoB,
            "Disco de Teste",
            45.5, // duração total
            "Vinil clássico de capa dupla",
            "Bom estado"
        );

        // Passo 3: Criar lista de artistas
        List<String> artistas = Arrays.asList("Artista 1", "Artista 2");

        // Passo 4: Criar lista de faixas e letras
        List<String> faixas = Arrays.asList(
            "Intro",
            "Primeira Música",
            "Segunda Música",
            "Terceira Música",
            "Quarta Música",
            "Encerramento"
        );

        List<String> letras = Arrays.asList(
            "Letra da Intro",
            "Letra da Primeira Música",
            "Letra da Segunda Música",
            "Letra da Terceira Música",
            "Letra da Quarta Música",
            "Letra do Encerramento"
        );

        // Passo 5: Criar o objeto MidiaMusical usando o vinil como formato físico
        MidiaMusical midiaMusical = new MidiaMusical(
            artistas,
            faixas.size(),
            faixas,
            letras,
            1, // id
            "Album de Teste",
            "01/01/1990",
            "15/04/2024",
            "Brasil",
            vinil
        );

        // Passo 6: Exibir informações no console
        System.out.println("===== INFORMAÇÕES DA MÍDIA MUSICAL =====");
        System.out.println("Título: " + midiaMusical.getTitulo());
        System.out.println("Artistas: " + String.join(", ", midiaMusical.getArtistas()));
        System.out.println("Número de Faixas: " + midiaMusical.getNumFaixas());
        System.out.println("Nacionalidade: " + midiaMusical.getNacionalidade());
        System.out.println("Data de Lançamento: " + midiaMusical.getDataLancamento());
        System.out.println("Data de Aquisição: " + midiaMusical.getDataAquisicao());

        System.out.println("\n--- Informações do Formato Físico ---");
        vinil.exibirInfo(); // usa o método sobrescrito que mostra lado A e B
    }
}
