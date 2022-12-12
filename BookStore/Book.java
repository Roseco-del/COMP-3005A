public class Book {
    
    public String name;
    private int ISBN = 10000;
    public String[] genre;
    public int nOfPages;
    public int price;


    public Book(String name, String[] genre, int nOfPages, int price){
        this.name = name;
        this.genre = genre;
        this.nOfPages = nOfPages;
        this.price = price;
        ++ISBN;
    }

    private String getGenres(){
        int i = 0;
        while(i < genre.length){
            return genre[i] + ", ";
        }
        return ".";
    }

    public String toString(){
        return "Name: " +  name + "\nGenre(s): " + getGenres() + "\nNo of Pages: " + nOfPages + "\nPrice: " + price;
    }
}
