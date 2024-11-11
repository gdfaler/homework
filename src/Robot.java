public class Robot extends Zomby{
    private int laserDmg;

    public Robot(int hp, int dmg, int laserDmg,  int shld) {
        super(hp, dmg, shld);
        this.laserDmg = laserDmg;
    }
    public int attackRbt(int n) {
        n -= laserDmg;
        return n;
    }

    public void attackRbt(boolean booling, int n) {
        if (booling == true) {
            while((shld != 0) && (n != 0)) {
                shld -= 1;
                n -= 1;
            } hp -= n;
        }
    }
}
