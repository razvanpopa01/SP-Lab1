import java.awt.*;
import java.awt.geom.Area;
import java.security.PrivilegedExceptionAction;

public class ImageProxy implements Element, Picture {
    String url;
    Dimension dim;
    Image realImage;


    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }

    Image loadImage() {
        if(realImage == null) {
            realImage = new Image(url);
        }
        return realImage;

    }

    @Override
    public void print() {
        realImage = loadImage();
        System.out.println("Url: " + this.url);
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
        visitor.visitImageProxy(this);
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }
}
