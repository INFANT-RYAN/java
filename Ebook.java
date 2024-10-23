public class Ebook extends condition {

    String eTitle;
    String eAuthour;
    String ePrice;
    String Size;

    Ebook() {
        condition par = new condition();
        par.getData();
        eTitle = par.title;
        eAuthour = par.authour;
        ePrice = par.price;
    }

    Ebook(String siz) {
        condition par = new condition();
        par.getData();
        eTitle = par.title;
        eAuthour = par.authour;
        ePrice = par.price;
        Size = siz;
    }

    void disp() {
        System.out.println("Etitle: " + eTitle);
        System.out.println("Eauthour: " + eAuthour);
        System.out.println("Price:" + ePrice);
        System.out.println("Size: " + Size);

    }

    public static void main(String[] args) {
        
        
        Ebook obj1 = new Ebook();
        
        obj1.disp();

    }

}
