package sb02.stream.pr2;

public class LambdaCaptureDemo {
    private static String staticField = "Static field";
    private String memberField = "Outer field";

    public void testLambda() {
        String localVar = "Local variable";

        Runnable r = () -> {
            memberField = "member field Changed";
            LambdaCaptureDemo.staticField = "Static field changed!!";
            System.out.println("멤버 변수: " + memberField);
            System.out.println("Static 변수: " + LambdaCaptureDemo.staticField);
            System.out.println("로컬 변수: " + localVar);
        };

        r.run();
    }

    public static void main(String[] args) {
        new LambdaCaptureDemo().testLambda();
    }
}
