public class Task4 {
    public static void main(String[] args){

        //Declare Variables
        double balance = 1000;
        double INTEREST = 1.05;

        //Loop
        for (int year = 0; year < 3; year++) {
            balance = balance * INTEREST;
            System.out.println("Balance: " + balance);

        }

    }
}
