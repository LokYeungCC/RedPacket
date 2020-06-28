import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int availableMoney) {
        super(name, availableMoney);
    }

    public void receive(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
        int delta = list.remove(index);
        int memoy = super.getAvailableMoney();
        super.setAvailableMoney(memoy + delta);
    }




}
