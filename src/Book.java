import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    Author author;
    List<Paragraph> paragraphs=new ArrayList<>();
    List<Image> images=new ArrayList<>();
    List<Table> tables=new ArrayList<>();
    List<Chapter> chapters=new ArrayList<>();
    public Book(){}

    public Book(String title){
        this.title=title;

    }

    public void createNewParagraph(Paragraph paragraph){
        paragraphs.add(paragraph);
    }

    public int createChapter(String chapter){
        Chapter addChapter=new Chapter(chapter);
        chapters.add(addChapter);
        return chapters.indexOf(addChapter);
    }

    public void createNewImage(Image image){
        images.add(image);
    }

    public void createNewTable(Table table){
        tables.add(table);
    }

    public void addAuthor(Author author){}

    public void print() {
        System.out.println( "Book{" +
                "title='" + this.title + '\'' +
                ", paragraphs=" + this.paragraphs +
                ", images=" + this.images +
                ", tables=" + this.tables +
                '}');
    }

    public Chapter getChapter(int indexChapterOne) {
        return chapters.get(indexChapterOne);
    }
}
