import java.util.Random;

public class Player {
    Random r = new Random();
    byte number;
    public byte guess(){
        number = ((byte)r.nextInt(1,8));
        return number;
    }
}
