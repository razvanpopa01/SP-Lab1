import java.lang.reflect.Array;
import java.util.ArrayList;

public class TableOfContents implements Element{
    ArrayList<String> contents;

    public TableOfContents() {
        this.contents = new ArrayList<String>();
    }

    @Override
    public void print() {
        contents.forEach(System.out::println);
    }

    @Override
    public void add(Element addElement) {

    }

    @Override
    public void remove(Element removeElement) {

    }

    @Override
    public int get(Element getElement) {
        return 0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }

    public void addEntry(String entry) {
        contents.add(entry);
    }
}
