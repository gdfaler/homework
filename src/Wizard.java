public class Wizard extends Zomby{
    private int mgcDmg;

    public Wizard(int hp, int dmg, int mgcDmg,  int shld) {
        super(hp, dmg, shld);
        this.mgcDmg = mgcDmg;
    }
}
