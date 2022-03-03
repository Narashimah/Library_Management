public class BookDetails {
    public String BookName;
    public String Author;
    public int YearofPub;
    public int TotNoBooks;
    public boolean Available;
    BookDetails(String bname, String auth, int yop, int tob, boolean av) {
        this.BookName = bname;
        this.Author = auth;
        this.YearofPub = yop;
        this.TotNoBooks = tob;
        this.Available = av;
    }


    public String getBookName() {
        return BookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String auth) {
        Author = auth;
    }

    public int getYearofPub() {
        return YearofPub;
    }

    public void setYearofPub(int yop) {
        YearofPub = yop;
    }

    public int getTotNoBooks() {
        return TotNoBooks;
    }

    public void setTotNoBooks(int tob) {
        TotNoBooks = tob;
    }

    public boolean isAvailable() {
        return Available;
    }
    public void BookDisplayinfo() {
        System.out.println("BookName :" + BookName + " ||Author_Name :" + Author + " ||Year_of_Publication : " + YearofPub + " ||Total_no_of_books : " + TotNoBooks + " ||Available : " + Available);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}