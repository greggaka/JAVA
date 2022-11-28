public class CafeJava {
    public static void main(String[] args) {
        //APP VARIABLES****
        //Lines of text that will appear in the app
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        //Menu variables 
        double mochaPrice = 3.5;
        double dripCoffeePrice = 4.0;
        double lattePrice = 4.5;
        double cappucinoPrice = 5.5;

        //Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        //Order completions
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
        //****


        //APP INTERACTION SIMULATION
        //Scenario 1
        System.out.println(generalGreeting + customer1);
        System.out.println(displayTotalMessage + dripCoffeePrice);
        System.out.println(isReadyOrder1 ? customer1 + readyMessage : customer1 + pendingMessage);

        //Scenario 2
        System.out.println(generalGreeting + customer4);
        System.out.println(displayTotalMessage + cappucinoPrice);
        System.out.println(isReadyOrder4 ? customer4 + readyMessage : customer4 + pendingMessage);

        //Scenario 3
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + (lattePrice * 2));
        System.out.println(isReadyOrder2 ? customer2 + readyMessage : customer2 + pendingMessage);
        isReadyOrder2 = false;
        System.out.println(isReadyOrder2 ? customer2 + readyMessage : customer2 + pendingMessage);

        //Scenario 4
        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + dripCoffeePrice);
        System.out.println("You owe " + (lattePrice - dripCoffeePrice));
        System.out.println(isReadyOrder3 ? customer3 + readyMessage : customer3 + pendingMessage);

    }
}
