import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Numeros {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toUnmodifiableList());
        Optional<List<Integer>> optionalList = Optional.ofNullable(numerosPares);


        optionalList.ifPresent(lista -> lista.forEach(System.out::println));

    }
}
