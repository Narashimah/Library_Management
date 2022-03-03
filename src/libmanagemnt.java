import java.util.*;
class libmanagemnt {

    public static void main(String[] args) {
        List <BookDetails> book = new ArrayList<>();
        List <BookingDetails> bookings = new ArrayList<>();
        book.add(new BookDetails("Science","arun",2002,13,true));
        book.add(new BookDetails("Social","Gowri",2021,0,false));
        book.add(new BookDetails("Maths","Giri",2010,21,true));
        book.add(new BookDetails("English","Rajesh",2015,12,true));
        book.add(new BookDetails("History","Thiyagesh",2022,31,true));
        book.add(new BookDetails("Geography","Magesh",2012,13,true));
        book.add(new BookDetails("physics","Niresh",2022,23,true));
        book.add(new BookDetails("Chemistry","Hari",2010,3,true));
        int useropt = 1;
        Scanner sc = new Scanner(System.in);
        for (BookDetails b : book) {
            b.BookDisplayinfo();
        }
        while (useropt == 1) {
            System.out.println("Press 1 for Booking \nPress 2 to exit");
            useropt = sc.nextInt();
            if(useropt == 1) {
                BookingDetails bk = new BookingDetails();
                for(BookDetails d : book){
                    if( d.getBookName().contains(bk.bname)){
                        if(d.getTotNoBooks()!=0){

                            int a= d.getTotNoBooks();
                            int b=d.getYearofPub();
                            bookings.add(bk);
                            d.setTotNoBooks(--a);
                            System.out.println("Your Book is Confirmed, Happy Learning\n");
                            System.out.println("Book Author is "+d.Author);
                            System.out.println("Year of Publications "+d.YearofPub);
                            System.out.println("Book Have? " +d.Available);
                            System.out.println("Book "+d.BookName+" Balance Book is "+d.getTotNoBooks());
                        }else{
                            System.out.println("Sorry Book is Full,Try Another Book ");
                        }

                    }
                    //something here
                }
            }
            if(useropt > 2 ){
                System.out.println("Invalid No");
            }

        }
    }
}