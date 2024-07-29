import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ListaDePessoas {
    public static void main (String[] args){
        Map<String,  Integer> listaDePessoas = new HashMap<>();

        listaDePessoas.put("Maria" , 30);
        listaDePessoas.put("Milena", 20);
        listaDePessoas.put("Sandra", 54);
        listaDePessoas.put("Valentina", 7);

        System.out.println(listaDePessoas);

        Map<String, Integer> lista = new TreeMap<>(listaDePessoas);
        System.out.println(lista);

        Map<String, Integer> listaLink = new LinkedHashMap<>(listaDePessoas);
        System.out.println(listaLink);

        boolean mariaTrue = listaDePessoas.containsKey("Maria");
        System.out.println(mariaTrue);
        boolean idade = listaDePessoas.containsValue(5);
        System.out.println(idade);

    }
}
