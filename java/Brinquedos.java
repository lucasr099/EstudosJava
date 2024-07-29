import java.util.ArrayList;
import java.util.List;

public class Brinquedos {
    public static void main(String[] args){
        List<String> brinquedo = new ArrayList<>();
        brinquedo.add("Bola");
        brinquedo.add("Boneca");
        brinquedo.add("gude");
        brinquedo.add("Bicicleta");

        boolean brinquedosExistentes = brinquedo.contains("Bola");
        System.out.println("tem bola: " + brinquedosExistentes );

        int indiceBrinquedo = brinquedo.indexOf("Boneca");
        System.out.println(indiceBrinquedo);

        int indiceBike = brinquedo.indexOf("bike");
        System.out.println(indiceBike);
    }
}
