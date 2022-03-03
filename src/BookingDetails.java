import java.util.*;
public class BookingDetails {
    String bname;
    String CustomerName;
    String gender;
    int Age;
    BookingDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name : ");
        CustomerName = sc.next();
        System.out.println("Enter Customer Age : ");
        Age = sc.nextInt();
        System.out.println("Gender: ");
        gender = sc.next();
        System.out.println("Enter BookName : ");
        bname = sc.next();
    }

}