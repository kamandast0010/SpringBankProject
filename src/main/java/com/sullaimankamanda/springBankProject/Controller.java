import java.util.Scanner;

public class Controller extends Customers {
    public void bankAtm() {
        Customers customer1 = new Customers();
        while (true) {
        int option = 0;
        Scanner scan = new Scanner(System.in);
            System.out.println("------------------------Bank System------------------------");
        System.out.println("""
                1).Add Customer
                2).Deposit Funds
                3).Withdraw Funds
                4).Display Customer Details
                5.Remove Customer
                6.). Update Customer
                7.). 'exit'
                """);
        try {
            option = scan.nextInt();
        }catch(Exception e){
            System.out.println("invalid value: ");
        }

            switch (option) {
                case 1:
                    customer1.addCustomer();
                    break;
                case 2:
                    customer1.depositFunds();
                    break;
                case 3:
                    System.out.println("---------------------------Withdraw Funds -----------------------------");
                    customer1.withdrawFunds(true);
                    break;
                case 4:
                    System.out.println("---------------------------Account Details-----------------------------");
                    customer1.displayCustomer();
                    break;
                case 5:
                    System.out.println("---------------------------Remove Customer-----------------------------");
                    customer1.removeCustomer();
                    break;
                case 6:
                    customer1.updateCustomer();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("invalid entry try again...");
            }
            if(option == 7){
                break;
            }
        }

    }
}