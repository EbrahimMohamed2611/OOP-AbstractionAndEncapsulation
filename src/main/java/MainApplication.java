import Abstraction.Microwave;

public class MainApplication {
    public static void main(String[] args) {

        Microwave microwave = new Microwave("12.5 F","programe 1",20);
        System.out.println(microwave.deFreeze());
    }
}
