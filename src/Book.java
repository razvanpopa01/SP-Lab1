import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    List<String> paragraphs=new ArrayList<String>();
    List<String> images=new ArrayList<String>();
    List<String> tables=new ArrayList<String>();
    public Book(){}

    public Book(String title){
        this.title=title;
    }

    public void createNewParagraph(String paragraph){
        paragraphs.add(paragraph);
    }

    public void createNewImage(String image){
        images.add(image);
    }

    public void createNewTable(String table){
        tables.add(table);
    }


    public void print() {
        System.out.println( "Book{" +
                "title='" + this.title + '\'' +
                ", paragraphs=" + this.paragraphs +
                ", images=" + this.images +
                ", tables=" + this.tables +
                '}');
    }
}
