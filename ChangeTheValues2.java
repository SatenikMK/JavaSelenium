import java.sql.SQLOutput;

public class ChangeTheValues2 {
    public static void main(String[] args){
        int x = 5;
        int y = 6;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
    }
}
