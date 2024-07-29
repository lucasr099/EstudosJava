import java.util.*;

public class ListaCores {
    public static void main (String[] args){
        Set<String> listaDeCores = new HashSet<>();

        listaDeCores.add("amarelo");
        listaDeCores.add("azul");
        listaDeCores.add("verde");
        listaDeCores.add("preto");
        listaDeCores.add("vermelho");

        System.out.println(listaDeCores);
        listaDeCores.add("verde");


        Set<String> coreOrdems = new TreeSet<>(listaDeCores);
        System.out.println(coreOrdems);

        Set<String> cores = new LinkedHashSet<>(listaDeCores);
        System.out.println(cores);
    }
}
