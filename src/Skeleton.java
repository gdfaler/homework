public class Skeleton extends Zomby{
    private int boneDmg;

    public Skeleton(int hp, int dmg, int boneDmg,  int shld) {
        super(hp, dmg, shld);
        this.boneDmg = boneDmg;
    }
}
