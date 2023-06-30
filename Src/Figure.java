public abstract class Figure {
    float x; // x-координата
    float y; // y-координата

    Figure(float x, float y){

        this.x=x;
        this.y=y;
    }
    // абстрактний метод для отримання периметра
    public abstract float getPerimeter();
    // абстрактний метод для отримання площи
    public abstract float getArea();
}
