package sb02.oop.pr7.Inner_class;

public class Outer {
    private int instanceValue = 200;

    public Outer(int value){
        this.instanceValue = value;
    }

    public class Inner{
        public void printInstanceValues(){
            System.out.println("Outer.instanceValue: " + instanceValue);
        }
    }
}