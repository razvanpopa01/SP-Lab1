public class Main {
    public static void main(String[] args) {
        An info3=new An("Informatica 3");
        Grupa grupa1=new Grupa("Grupa 1");
        Semigrupa semigrupa1=new Semigrupa("Semigrupa 1.1");
        info3.add(grupa1);
        Semigrupa semigrupa2=new Semigrupa("Semigrupa 1.2");
        grupa1.add(semigrupa1);
        grupa1.add(semigrupa2);
        Student student1=new Student("Popescu I","popescu@acme.edu");
        Student student2=new Student("Ionescu E","ionescu@acme.edu");
        semigrupa1.add(student1);
        semigrupa1.add(student2);
        Student student3=new Student("Vasilescu I","vaso;esci@acme.edu");
        Student student4=new Student("Georgescu E","georgescu@acme.edu");
        semigrupa2.add(student3);
        semigrupa2.add(student4);
        System.out.println(info3);



    }
}
