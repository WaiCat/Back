package sb02.oop.pr7.anonymous_class;

public class TestCalss {
    private final String someString = "hello";

    public void test(){

        System.out.println(this.someString);

        EventListener listener = new EventListener(){
            private final String someString = "world";
            @Override
            public void onEvent(String eventData) {
                System.out.println("Received event: " + eventData);
                System.out.println(this.someString);
            }
        };

        listener.onEvent("event 1");
    }
}
