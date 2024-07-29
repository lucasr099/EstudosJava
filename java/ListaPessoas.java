import java.util.*;

public class ListaPessoas {
    public static void main(String[] args){
        List<Integer> listaPessoas = Arrays.asList(1, 2, 3 , 4 , 5, 6 ,7);

        listaPessoas.forEach(System.out::println );

        Map<Integer, String> numeroExtensao = new TreeMap<>();

        numeroExtensao.put(1,"Um");
        numeroExtensao.put(2,"Dois");
        numeroExtensao.put(3, "Três");

        numeroExtensao.forEach((numero, nome)-> System.out.println());
    }
}
