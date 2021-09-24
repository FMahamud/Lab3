public class Main {
    public static void main(String[] args){
        BuddyInfo bud1 = new BuddyInfo();
        BuddyInfo bud2 = new BuddyInfo("Greg");
        BuddyInfo bud3 = new BuddyInfo("Oni");

        AddressBook book = new AddressBook();

        book.addBuddy(bud1);
        book.addBuddy(bud2);
        book.addBuddy(bud3);

        for (int i = 0; i < book.getBook().size(); i++){
            System.out.println(book.getBook().get(i).name);
        }

        //book.removeBuddy(bud2);
        System.out.println();

        for (int i = 0; i < book.getBook().size(); i++){
            System.out.println(book.getBook().get(i).name);
        }
    }
}
