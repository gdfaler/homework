public class Human extends Zomby{
    public Human(int hp, int dmg, int shld) {
        super(hp, dmg, shld);
    }

    @Override
    protected void attack(boolean booling, int n) {
        if (booling == true) {
            while ((shld != 0) && (n != 0)) {
                shld -= 1;
                n -= 1;
            } hp -= n;
            if (hp <= 0) {
                System.out.println("DEAD");
            }
        } else {
            System.out.println("Промах");
        }
    }
}
