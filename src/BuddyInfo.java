public class BuddyInfo {

    public String name;
    public String address;
    public String phoneNumber;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public BuddyInfo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(){
        this.name = "Bob";
    }

    public String getName() {
        return name;
    }
}