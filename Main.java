import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
    //team kamatis
    class UserAuth{

        //fields
        String userName;
        String userNumber;
        String userPin;
        double userBalance;

        //constructor
        public UserAuth(String userName, String userNumber, String userPin, double userBalance){
            this.userName = userName;
            this.userNumber = userNumber;
            this.userPin = userPin;
            this.userBalance = userBalance;
        }

        //getters
        public String getUserName(){
            return userName;
        }
        public String getUserNumber(){
            return userNumber;
        }
        public String getUserPin(){
            return userPin;
        }
        public double getUserBalance(){
            return userBalance;
        }

        //setter
        public void setUserName(String newName){
            this.userName = newName;
        }
        public void setUserNumber(String newNumber){
            this.userNumber = newNumber;
        }
        public void setUserPin(String newPin){
            this.userPin = newPin;
        }
        public void setUserBalance(double newBalance){
            this.userBalance = newBalance;
        }


    }

    //team kamatis eof

    //team sibuyas
    
    static class LoginValidation {
        public static boolean validate(
            String userName,
            String userNumber,
            String userPin
        ) {
            List<UserAuth> validUsers = new ArrayList<>();
            validUsers.add(new UserAuth("Test1", "123", "123", 200.00));
            validUsers.add(new UserAuth("Test2", "234", "123", 200.00));
            validUsers.add(new UserAuth("Test3", "345", "123", 200.00));
            validUsers.add(new UserAuth("Test4", "456", "123", 200.00));
            validUsers.add(new UserAuth("Test5", "567", "123", 200.00));
            
            boolean isValid = false;
            for (UserAuth validUser : validUsers) {
                if((userName.equals(validUser.getUserName()) & userPin.equals(validUser.getUserPin()))
                | (userNumber.equals(validUser.getUserNumber()) & userPin.equals(validUser.getUserPin()))) {
                    isValid = true;
                }
            }
            return isValid;
        }
    }

    //team sibuyas eof

    
}
//team ba
    class Console {
        Scanner sc = new Scanner(System.in);

        public void displayMenu(){
            System.out.println("<<<<< Welcome To Black Banking System >>>>>>");
            System.out.println("Options: ");
            System.out.println("1: Login");
            System.out.println("2: Exit");
            System.out.println("Enter your choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    displayLogin();
                    break;
                case "2":
                    System.out.println("Thank you for using our banking system. Exiting....");
                    System.exit(0);
            }
        }

        public void displayLogin(){
            Scanner sc = new Scanner(System.in);
            final int MAX_LOGIN_LIMIT = 3;
            boolean isSuccessLogin = false;
            int numTries = 0;
            while(true){
                if(numTries <= MAX_LOGIN_LIMIT){
                    System.out.println("Please enter username: ");
                    String username = sc.nextLine();
                    System.out.println("Please enter your password: ");
                    String userPin = sc.nextLine();
                    UserAuth user = Auth.login(username, userPin);
                    if(user !== null){
                        displayDashboard(user);
                        break;
                    }else{
                        System.out.println("Invalid username or password");
                        numTries++;
                    }
                }else{
                    System.out.println("Sorry your ip is blocked!");
                    break;
                }
            }
        }

        public void displayDashboard(UserAuth user){
            while(true){
                System.out.println("Welcome " + user.getUserName());
                System.out.println("Options: ");
                System.out.println("1: Check Balance");
                System.out.println("2: Deposit");
                System.out.println("3: Change Pin");
                System.out.println("4: Exit");

                String input = sc.nextLine();

                switch (input) {
                    case "1":
                        System.out.println("Your current balance is: " + user.getUserBalance());
                        break;
                    case "2":
                        System.out.println("Please enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        deposit(amount, user);
                        break;
                    case "3":
                        System.out.println("Please enter old pin: ");
                        String oldPin = sc.nextLine();
                        System.out.println("Enter new pin: ");
                        String newPin = sc.nextLine();
                        validatePin(oldPin, newPin, user);
                        break;
                    case "4":
                        System.exit(0);
                    default:
                        break;
                }
            }
        }

        public void deposit(double amount, UserAuth user){
            user.setUserBalance(amount);
        }

        public void validatePin(String oldPin, String newPin, UserAuth user){
            if(!user.getUserPin().equals(oldPin))
                System.out.println("Old pin not matched!");
            else
                user.setUserPin(newPin);
        }
    }
//team ba eof

