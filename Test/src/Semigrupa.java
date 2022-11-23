import java.util.ArrayList;
import java.util.List;

public class Semigrupa {
    public Semigrupa(){}
    public String nume;
    public List<Student> studenti=new ArrayList<Student>();
    public Semigrupa(String nume){
        this.nume=nume;
    }

    public void add(Student student){
        studenti.add(student);

    }
    @Override
    public String toString() {
        return "        "+nume+"\n"+studenti;
    }
}
