public class Dog extends Animal{
    private String bark;
    public Dog(String name, int age, String bark) {
        super(name, age);
        this.bark = bark;
    }

    @Override
    public void voice() {
        System.out.println("gav-gav");
    }

    @Override
    public String toString() {
        return "Dog{" +"Name: " + getName() + " age = " + getAge() +
                " bark='" + bark + '\'' +
                '}';
    }
}
