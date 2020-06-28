import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int availableMoney) {
        super(name, availableMoney);
    }

    public ArrayList<Integer> send(int totalMoneySent,int countCut){
        ArrayList<Integer> redList = new ArrayList<>();

        int leftMomey = super.getAvailableMoney();
        if (totalMoneySent > leftMomey){
            System.out.println("Sorry, you dont have enough balance");
            return redList;
        }
        super.setAvailableMoney(leftMomey - totalMoneySent);

        int avg = totalMoneySent / countCut;
        int mod = totalMoneySent % countCut;

        for (int i = 0; i < countCut - 1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
