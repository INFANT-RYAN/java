import java.util.Scanner;

public class condition {
    String title;
    String authour;
    String price;  
    Scanner obj = new Scanner(System.in);
    void getData(){
        System.out.println("Enter title:");
        title = obj.nextLine();
        System.out.println("Enter authour:");
        authour = obj.nextLine();
        System.out.println("Enter price:");
        price = obj.nextLine();
    }
    void setData(){
        System.out.println(authour);
        System.out.println(title);
        System.out.println(price);

    }
    
}