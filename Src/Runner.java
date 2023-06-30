public class Runner implements Moving, Eating{

    private String name;
    private int age;

    public Runner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void move() {
        System.out.println("i am running");
    }

    @Override
    public void eat() {
        System.out.println("i am eating when rest");
    }
}
