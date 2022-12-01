public class TestBankAccount {
    public static void main (String[] args) {
        
        BankAccount Chase = new BankAccount("Chase", "Gregg");
        Chase.display();
        Chase.deposit("checking", 1000.00);
        Chase.deposit("savings", 500.50);
        System.out.println("\n");
        Chase.display();
        System.out.println("\n");
        Chase.withdraw("checking", 100.50);
        Chase.withdraw("savings", 400.00);
        System.out.println("\n");
        Chase.display();

        BankAccount boh = new BankAccount("BoH", "Gregg");
        boh.display();
        boh.deposit("checking", 5000.00);
        boh.deposit("savings", 200.00);
        boh.display();
        boh.withdraw("checking", 6000.00);
        boh.withdraw("savings", 100.00);
        boh.display();

    }
}