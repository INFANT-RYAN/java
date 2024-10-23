public class Rectangle {
    int length, breadth;
    Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    Rectangle(int l){
        length = breadth = l;
    }
    void area(){
        System.out.println("Area of the rectangle : "+length*breadth);
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(7,2);
        Rectangle rect1 = new Rectangle(2);
        rect.area();
        rect1.area();
    }
}
