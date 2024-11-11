public class Main {
    public static void main(String[] args) {
        Zomby com = new Zomby(100, 10, 20);
        Robot android = new Robot(150, 20, 50, 30);
        Wizard magician = new Wizard(75, 0, 40, 50);
        Skeleton sans = new Skeleton(1, 10, 30, 0);
        Human fritz = new Human(100, 25, 30);

        com.getHp();
    }
}
