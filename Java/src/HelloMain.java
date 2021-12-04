import java.util.List;

public class HelloMain {
    public static void main(String[] args) {
        var helloList = List.of(new Hello1(), new Hello2());
        helloList.stream().forEach(h -> {
            System.out.println(h.X());
            System.out.println(h.Y());
        });
    }
}
