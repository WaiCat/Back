package sb02.oop.pr7.func_intf;

public class LamdaDemo {
    public static void main(String[] args) {
        MyCalculator addAnonymous = new MyCalculator(){

            @Override
            public int operator(int x, int y) {
                return x + y;
            }
        };


        MyCalculator addLambda = (x, y) -> x + y;
        System.out.println("addLambda.operator(3, 5)); = " + addLambda.operator(3, 5));

    }
}
