public class BookStatistics implements Visitor {
        int numberOfParagraphs;
        int numberOfImages;
        int numberOfTables;

        BookStatistics() {
            this.numberOfParagraphs = 0;
            this.numberOfImages = 0;
            this.numberOfTables = 0;
        }

        public void visitBook(Book book) {

        }

        public void visitSection(Section section) {

        }

        public void visitTableOfContents(TableOfContents tableOfContents) {

        }

        public void visitParagraph(Paragraph paragraph) {
            this.numberOfParagraphs++;
        }

        public void visitImageProxy(ImageProxy imageProxy) {
            this.numberOfImages++;
        }

        public void visitImage(Image image) {
            this.numberOfImages++;
        }

        public void visitTable(Table table) {
            this.numberOfTables++;
        }

        public void printStatistics() {
            System.out.println("Book stats:\nNumber of images:" + this.numberOfImages + "\nNumber of paragraphs:" + this.numberOfParagraphs + "\nNumber of tables:" + this.numberOfTables);
        }
}
