public class Circle extends Figure{
    private float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


    @Override
    public float getPerimeter() {
        return radius * 2.0f * 3.14f;
    }

    @Override
    public float getArea() {
        return 3.14F * radius * radius;
    }


}
