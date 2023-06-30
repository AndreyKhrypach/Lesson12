public  class Cat extends Animal{
    private String bark;
    public Cat(String name, int age, String bark) {
        super(name, age);
        this.bark = bark;
    }

    @Override
    public  void voice() {
        System.out.println("miau-miau");
    }

    @Override
    public String toString() {
        return "Cat{" + "Name: " + getName() + " age = " + getAge() +
                " bark='" + bark + '\'' +
                '}';
    }
}
