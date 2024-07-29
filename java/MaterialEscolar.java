import java.util.*;

public class MaterialEscolar {
    public static void main(String[] args){
        Map<String, Integer> materialEscolar = new TreeMap<>();

        materialEscolar.put("lápis", 2);
        materialEscolar.put("lapiseira" , 4);
        materialEscolar.put("borracha", 9);
        materialEscolar.put("caneta", 3);
        materialEscolar.put("grafite", 1);
        materialEscolar.put("caderno", 6);

        System.out.println(materialEscolar);


        List<Map.Entry<String , Integer>> materialValor = new ArrayList<>(materialEscolar.entrySet());
        materialValor.sort(Map.Entry.comparingByValue());
        System.out.println(materialValor);


    }
}
