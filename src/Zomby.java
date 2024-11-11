public class Zomby {
    public int hp;
    private int dmg;
    public int shld;

    public Zomby(int hp, int dmg, int shld) {
        this.hp = hp;
        this.dmg = dmg;
        this.shld = shld;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    protected void attack(boolean booling, int n) {
        if (booling == true) {
            while ((shld != 0) && (n != 0)) {
                shld -= 1;
                n -= 1;
            }
        } else {
            System.out.println("Промах");
        }
    }
}
