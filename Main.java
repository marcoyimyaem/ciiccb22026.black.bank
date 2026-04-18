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

    //team ba

    //team ba eof
}
