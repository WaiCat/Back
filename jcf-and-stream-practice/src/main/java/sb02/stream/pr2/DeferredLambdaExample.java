package sb02.stream.pr2;

public class DeferredLambdaExample {
    public static void main(String[] args) {
        Runnable r = createRunnable();
        r.run();
    }

    public static Runnable createRunnable() {
        String localVar = "Hello, I'm a local variable!";

        return () -> {
            System.out.println(localVar);
        };
    }
}
