import EnumHelper.Color;
import EnumHelper.Day;
import EnumHelper.Operation;
import EnumHelper.Topic;

public class Lesson12Program {
    public static void main(String[] args) {

        String name = "Andrey";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));   // 14
        System.out.println(op);   // SUM
//        op = Operation.MULTIPLY;
//        System.out.println(op.action(6, 4));    // 24
//        op = Operation.SUBTRACT;
//        System.out.println(op.action(24, 14)); //10

        //enum colors
//        System.out.println(Color.RED.getCode());        // #FF0000
//        System.out.println(Color.GREEN.getCode());      // #00FF00
//        System.out.println(Color.BLUE);

//        Topic[] topics = Topic.values();
//        for (Topic s : topics) { System.out.println(s); }
//        System.out.println(Topic.BELLETRE.ordinal());

        //enum in switch case
//        Book b1 = new Book("War and Peace", "L. Tolstoy", Topic.BELLETRE);
//        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);
//
//        switch(b1.bookType){
//            case BELLETRE:
//                System.out.println(" Belletre");
//                break;
//            case SCIENCE:
//                System.out.println(" Science");
//                break;
//            case SCIENCE_FICTION:
//                System.out.println(" Science fiction");
//                break;
//            case PHANTASY:
//                System.out.println(" Phantasy");
//                break;
//        }

        //enum
//        Day current = Day.FRIDAY;
//        System.out.println(current);

        // interface
//        Runner anton = new Runner("Anton", 25);
//        anton.move();
//        anton.eat();;

        // figures abstract class
//        Rectangle rectangle = new Rectangle(1,3, 4, 5);
//        Circle circle = new Circle(6, 5, 23);
//
//        System.out.println(rectangle.getPerimeter());
//        System.out.println(rectangle.getArea());
//        System.out.println(circle.getPerimeter());
//        System.out.println(circle.getArea());

        //animals
//       Animal dog = new Dog("Dog", 3, "Sharik");
//       Animal cat = new Cat("Cat", 2, "Murchyk");
//
//       Cat cat1 = new Cat("Cate1", 4, "Vaska");
//
//        System.out.println(dog.toString());
//        System.out.println(cat.toString());
//        System.out.println(cat1.toString());
//
//        Animal animal = new Animal("Dog", 3){
//            @Override
//            public void voice() {
//                System.out.println("i am animal");
//            }
//        };
//        animal.animalInfo(animal.getName(), animal.getAge());
    }
}
