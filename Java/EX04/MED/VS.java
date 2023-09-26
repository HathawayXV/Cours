package EX04.MED;

public class VS extends Engins{
    String place1 = "";
    String place2 = "";
    int cout = 0;

    void embarquer(String p1){
        this.place1 = p1;
    }

    void embarquer(String p1, String p2){
        this.place1 = p1;
        this.place2 = p2;
    }

    int prix(int distance){
        if(distance >= 50){
            cout = 600;
        }
        else if (place2 != ""){
            cout = 2*150;
        }
        else{
            cout = 150;
        }
        return cout;
    }
}
