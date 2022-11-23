import java.util.ArrayList;
import java.util.List;

public class Grupa {
    public Grupa(){}
    public String nume;
    public List<Semigrupa> semigrupa=new ArrayList<Semigrupa>();
    public Grupa(String nume){
        this.nume=nume;
    }

    public void add(Semigrupa semigroup){
        semigrupa.add(semigroup);
    }
    @Override
    public String toString() {
        return "    " + nume +"\n" +semigrupa;
    }
}
