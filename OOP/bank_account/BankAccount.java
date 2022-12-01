
public class BankAccount {

    private static int numAccounts;
    private static double totalMoney;
    private String bankName;
    private String name;
    private double checking;
    private double savings;

    public BankAccount () {
        this.bankName = "Bank";
        this.name = "Guest";
        numAccounts ++;
    }

    public BankAccount (String bank, String name) {
        this.bankName = bank;
        this.name = name;
        this.checking = 0.0;
        this.savings = 0.0;
        numAccounts ++;
    }

    //methods
    public void display () {
        System.out.println("Bank: " + this.bankName);
        System.out.println("Name on Account: " + this.name);
        System.out.println("Total Number of Bank Accounts: " + numAccounts);
        System.out.println(this.bankName + " Account Details:");
        System.out.println("Checking Account Balance: " + this.checking);
        System.out.println("Savings Account Balance: " + this.savings);
        System.out.println("Total Account Balance: " + totalMoney);
    }

    public void deposit (String account, double amount) {
        if (account == "checking"){
            this.checking += amount;
            totalMoney += amount;
        }
        else if (account == "savings"){
            this.savings += amount;
            totalMoney += amount;
        }
        else {
        System.out.println("Please try again.");
        }
    }

    public void withdraw (String account, double amount) {
        if (account == "checking") {
            if (this.checking < amount) {
                System.out.println("Insufficient Funds. Please enter a lower amount");
            }
            else {
                this.checking -= amount;
                totalMoney -= amount;
            }
            
        }
        else if (account == "savings"){
            if (this.savings < amount) {
                System.out.println("Insufficient Funds. Please enter a lower amount");
            }
            else {
                this.savings -= amount;
                totalMoney -= amount;
            }
        }
        else {
            System.out.println("Error. Please try again.");
        }
    }

    //getters and setters
    public double getChecking() {
        return this.checking;
    }

    public double getSavings() {
        return this.savings;
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getName() {
        return this.name;
    }

    public static int getnumAccounts() {
        return numAccounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }
}