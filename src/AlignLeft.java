public class AlignLeft implements AlignStrategy{
    @Override
    public String render(Paragraph p, Context c) {
        return ": Alignment: Left";
    }

    public AlignLeft() {
    }
}
