package bus;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        String name, street, city, state, password, email;
        long phone;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter name:");
//        name = scanner.next();
//        System.out.println("Enter email:");
//        email = scanner.next();
//        System.out.println("Enter phone:");
//        phone = scanner.nextLong();
//        System.out.println("Enter street:");
//        street = scanner.next();
//        System.out.println("Enter city:");
//        city = scanner.next();
//        System.out.println("Enter state:");
//        state = scanner.next();
//        System.out.println("Enter password:");
//        password = scanner.next();

//        SignupLogin signupLogin = new SignupLogin();
//        // User user = signupLogin.signup(name,phone,email,street,city,state,password);
//        // System.out.println(user);
//        System.out.println(signupLogin.signup("kamal", 895623147, "k@gmail.com", "abc", "phag", "punj", "ans1"));
//        //System.out.println(signupLogin.signup("kamal", 895623147, "k@gamil", "abc", "phag", "punj", "ans1"));
//        System.out.println(signupLogin.login("k@gmail.com","an1"));

       BusOperations busOperations = new BusOperations();
       busOperations.addBus("HR0001","xyz","Panchkula","delhi",500);
       busOperations.addBus("UP0001","abc","Lucknow","delhi",500);
       busOperations.addBus("D0001","abcd","Panchkula","delhi",800);
       busOperations.addBus("D0002","xyz","Panchkula","delhi",900);


        busOperations.searchBus("Panchkula", "delhi");
    }

}