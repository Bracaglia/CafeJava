public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        System.out.println("Hello world!");
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        int dripCoffeePrice = 5;
        double lattePrice = 3.75;
        int cappuccinoPrice = 6;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer4 = "Noah";
        String customer3 = "Jimmy";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        System.out.println(generalGreeting + customer1);

        if(isReadyOrder1){
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else if(isReadyOrder2) {
            System.out.println(pendingMessage);
        }

        System.out.println(generalGreeting + customer2);
        if(isReadyOrder2){
            System.out.println(displayTotalMessage + (lattePrice + lattePrice));
        } else if (isReadyOrder3) {
            System.out.println(pendingMessage);
        }
        System.out.println(generalGreeting + customer3);
        if(isReadyOrder4){
            System.out.println(displayTotalMessage + (dripCoffeePrice - cappuccinoPrice));
        } else if (isReadyOrder3) {
            System.out.println(pendingMessage);
        }

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
//        System.out.println(generalGreeting + customer1);
    }
}