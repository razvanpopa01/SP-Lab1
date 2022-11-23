import java.util.ArrayList;
import java.util.List;

public class An {
    public An(){}
    public String nume;
    public List<Grupa> grupa=new ArrayList<>();

    public An(String nume){
        this.nume=nume;
    }

    public void add(Grupa group){
        grupa.add(group);
    }
    @Override
    public String toString() {
        return nume+"\n"+grupa;
    }
}
