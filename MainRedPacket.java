import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
     Manager manager = new Manager("Lok",100);
     Member one = new Member("MemberA",0);
     Member two = new Member("MemberB",0);
     Member three = new Member("MemberC",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("====================");

        ArrayList<Integer> redList = manager.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("====================");
    }
}
