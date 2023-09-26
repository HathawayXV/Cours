package EX05.rectangle;

public abstract class Forme {
    int width = 0, height = 0;

    abstract int getHeight();
    abstract void setwidth(int width);
    abstract void setheight(int height);

    public int calculAires(){
        int i =height*width;
        return i;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setheight(10);
        rect.setwidth(5);

        Carre car = new Carre();
        car.setheight(5);
        System.out.println(car.height);

        TestRectangle test = new TestRectangle(rect);
        System.out.println(test.RectangleIsValid());

    }
}
