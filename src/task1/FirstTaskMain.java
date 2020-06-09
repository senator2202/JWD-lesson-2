package task1;

public class FirstTaskMain {
    public static void main(String[] args) {
        String name = "";
        for (String s : args) {
            name = name + s + " ";
        }
        Hello obj = new Hello();
        obj.printHello(name);
    }
}
