public class User {
    public String name;
    public String billingAddress;
    public String shippingAddress;
    public String email;
    public String[] phoneNo;
    protected int id = 00010;
    public boolean reg = false;

    public User(String name, String billingAddress, String shippingAddress, String email, String[] phoneNo){
        this.name = name;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.email = email;
        this.phoneNo = phoneNo;
        ++id;
        reg = true;
    }

    public User(String shippingAddress){
        this.shippingAddress = shippingAddress;
    }

    public boolean checkout(){
        if(reg == true){
            return true;
        }
        return false;
    }

    private String getPhoneNo(){
        int i = 0;
        while(i < phoneNo.length){
            return phoneNo[i] + ", ";
        }
        return ".";
    }

    public String toString(){
        return name + "\n" + getPhoneNo() + "\n" + email + "\n" + billingAddress + "\n" + shippingAddress;
    }
}
