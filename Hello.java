public class Hello {


    public void greet() {
        System.out.println("Hello, World from an object!");
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.greet();
    }


}