import java.util.ArrayList;
import java.util.List;

public class BookStore {
    
    public String name;
    public int sales;
    public int expenditures;
    List<Book> books = new ArrayList<>();
    List<String[]> genreSales = new ArrayList<String[]>();
    List<String[]> authorSales = new ArrayList<String[]>();

    public BookStore(String name){
        sales = 0;
        expenditures = 0;
    }

    public void sale(int n){
        sales += n;
    }

    public void expenditure(int m){
        expenditures += m;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removebook(Book book){
        books.remove(book);
    }

    public void getBooks(){
        for (Book b : books) {
            b.toString();
        }
    }

    public String toString(){
        return "Sales: " + sales +  " vs Expenditure: " + expenditures ;
    }


    public static void main(String[] args){
        BookStore x = new BookStore("MyStore");
    }
}