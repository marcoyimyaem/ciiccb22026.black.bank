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
            if((userName.equals("Test") & userPin.equals("123"))
               | (userNumber.equals("123") & userPin.equals("123"))) {
                return true;
            }
            return false;
        }
    }

    //team sibuyas eof

    //team ba

    //team ba eof
}
