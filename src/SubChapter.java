import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    public String name;
    public List<Paragraph> paragraphs=new ArrayList<Paragraph>();
    public List<Image> images=new ArrayList<Image>();
    public List<Table> tables=new ArrayList<Table>();
    public SubChapter(){}
    public SubChapter(String name){this.name=name;}


    public void print() {
        System.out.println("name:"+name);

        System.out.print("Paragraphs:");
        for(Paragraph i:paragraphs)
            i.print();

        System.out.print("Images:");
        for(Image i:images)
            i.print();

        System.out.print("Tables:");
        for(Table i:tables)
            i.print();
    }

    public void createNewParagraph(String s) {
        Paragraph newParagraph=new Paragraph(s);
        paragraphs.add(newParagraph);
    }

    public void createNewImage(String s) {
        Image newImage=new Image(s);
        images.add(newImage);
    }

    public void createNewTable(String s) {
        Table newTable=new Table(s);
        tables.add(newTable);
    }
}
