public class Publisher {
    public String name;
    public String address;
    public String email;
    public String[] phoneNo;
    protected int account = 00010;

    public Publisher(String name, String address, String email, String[] phoneNo){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNo = phoneNo;
        ++account;
    }

    private String getPhoneNo(){
        int i = 0;
        while(i < phoneNo.length){
            return phoneNo[i] + ", ";
        }
        return ".";
    }


    public String toString(){
        return name + "\n" + getPhoneNo() + "\n" + email + "\n" + address;
    }
}
