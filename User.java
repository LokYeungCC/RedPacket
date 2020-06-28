public class User {
    private String name;
    private int availableMoney;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, int availableMoney) {
        this.name = name;
        this.availableMoney = availableMoney;
    }

    public void show(){
        System.out.println("I am:" + name);
        System.out.println("I have:" + availableMoney);
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(int availableMoney) {
        this.availableMoney = availableMoney;
    }
}
