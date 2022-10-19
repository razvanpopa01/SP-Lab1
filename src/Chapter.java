import java.util.ArrayList;
import java.util.List;

public class Chapter{
    public String name;
    public List<SubChapter> subChapters=new ArrayList<SubChapter>();
    public Chapter(){}
    public Chapter(String name){this.name=name;}
    public void print() {
        System.out.println("name"+name);


        System.out.print("Subchapters:");
        for(SubChapter i:subChapters)
            i.print();



    }

    public int createSubChapter(String s) {
        SubChapter createdSubchapter=new SubChapter(s);
        subChapters.add(createdSubchapter);
        return subChapters.indexOf(createdSubchapter);
        }


    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return subChapters.get(indexSubChapterOneOne);
    }
}
