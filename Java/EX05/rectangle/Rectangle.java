package EX05.rectangle;

public class Rectangle extends Forme{

    int getHeight() {
        return height;
    }

    void setwidth(int width){
        this.width = width;
    }

    void setheight(int height){
        this.height = height;
    }

    int calculAire(){
        int i =height*width;
        return i;
    }
}