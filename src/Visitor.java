public interface Visitor {

    public void visitBook(Book book);
    public void visitSection(Section section);
    public void visitTableOfContents(TableOfContents tableOfContents);
    public void visitParagraph(Paragraph paragraph);
    public void visitImage(Image image);
    public void visitImageProxy(ImageProxy imageProxy);
    public void visitTable(Table table);

}
