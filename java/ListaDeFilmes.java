import java.util.ArrayList;
import java.util.List;

public class ListaDeFilmes {
    public static void main(String[] args) {

        List<String> listaDeFilmes = new ArrayList<>();

        // 2. Adicionar 5 filmes à lista
        listaDeFilmes.add("O Poderoso Chefão");
        listaDeFilmes.add("Forrest Gump");
        listaDeFilmes.add("Os Vingadores");
        listaDeFilmes.add("Matrix");
        listaDeFilmes.add("Interestelar");

        // 3. Mostrar todos os filmes na lista
        System.out.println("Filmes na lista: " + listaDeFilmes);

        listaDeFilmes.set(1,"Vikings");
        System.out.println(listaDeFilmes);

        listaDeFilmes.remove(4);
        System.out.println(listaDeFilmes);

        int tamanhoLista = listaDeFilmes.size();
        System.out.println(tamanhoLista);

    }
}