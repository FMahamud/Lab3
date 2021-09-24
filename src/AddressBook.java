import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> book = new ArrayList<>();

    public ArrayList<BuddyInfo> getBook() {
        return book;
    }

    public void addBuddy(BuddyInfo bud){
        book.add(bud);
    }

    public void removeBuddy(int index){
        book.remove(index);
    }

    public void regFunction(){ System.out.println("Part 3: Step 4");}

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        book.removeBuddy(0);
        System.out.println("It works");
        System.out.println("Try again");
        System.out.println("Part 2: Step 18");
    }

}
