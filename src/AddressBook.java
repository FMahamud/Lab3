import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> book = new ArrayList<>();

    public ArrayList<BuddyInfo> getBook() {
        return book;
    }

    public void addBuddy(BuddyInfo bud){
        book.add(bud);
    }

    public void removeBuddy(BuddyInfo bud){
        book.remove(bud);
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }

}
