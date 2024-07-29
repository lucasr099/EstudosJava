import java.util.ArrayList;
import java.util.List;

public class ListaAnimais {
    public static void main(String[] args){
        List<String> listaAnimais = new ArrayList<>();

        listaAnimais.add("Leão");
        listaAnimais.add("Gato");
        listaAnimais.add("Cachorro");
        listaAnimais.add("Macaco");
        listaAnimais.add("Jiboia");
        System.out.println(listaAnimais);

        boolean listaLeao = listaAnimais.contains("Leão");
        System.out.println(listaLeao);

        int indiceGato = listaAnimais.indexOf("Gato");
        System.out.println(indiceGato);

        int lastAnimal = listaAnimais.lastIndexOf("Jiboia");
        System.out.println(lastAnimal);

        int tamanhoLista = listaAnimais.size();
        System.out.println(tamanhoLista);

        System.out.println(listaAnimais);

    }
}
