import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class EstudosLambda {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2,3 ,4, 5 ,6 ,7);
       // numeros.forEach(n -> System.out.println(n));

        numeros.forEach(System.out::println);


        BinaryOperator<Integer> somar = (a , b) -> a + b;



    }


}
