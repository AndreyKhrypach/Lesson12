public class Tiger extends Cat{

    public Tiger(String name, int age, String bark) {
        super(name, age, bark);
    }

    @Override
    public void voice(){
        System.out.println("RRRRRR");
    }
}
