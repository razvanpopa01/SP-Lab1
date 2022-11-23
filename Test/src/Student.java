public class Student {
    public Student(){}
    public String nume;
    public String email;
    public Student(String nume,String email){
        this.nume=nume;
        this.email=email;
    }

    @Override
    public String toString() {
        return "                "+nume +
                ", " + email+"\n";
    }
}
