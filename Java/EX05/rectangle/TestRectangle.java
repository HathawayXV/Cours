package EX05.rectangle;

public class TestRectangle {
    Rectangle R;
    Carre C;

    TestRectangle(Rectangle R) {
        this.R = R;
    }

    TestRectangle(Carre C) {
        this.C = C;
    }

    public boolean BonRectangle()
    {
        return R.width != R.height;
    }

    private boolean TestAire(){
        R.setheight(5);
        R.setwidth(10);
        return (R.calculAire() == 50);
    }

    public boolean RectangleIsValid(){
        return TestAire() && BonRectangle();
    }

    public boolean BonCarre(){
        return (C.height == C.width);
    }

    public boolean CarreIsValid(){
        return BonCarre();
    }
}
