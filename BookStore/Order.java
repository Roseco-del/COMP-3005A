public class Order {
    public String location;
    protected int number;

    public Order(int number){
        this.number = number;
    }

    public String toString(){
        return location;
    }
}
