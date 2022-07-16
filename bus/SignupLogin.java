package bus;

import java.util.ArrayList;
import java.util.List;

public class SignupLogin {

    List<User> userList = new ArrayList<>();

    public String signup(String name, long phone, String email, String street, String city, String state, String password) {
        for (User user : userList) {
            if (user.getContact().getEmail().equals(email)) {
                return ("Email taken already, signup again ");
                //return null;
            }
        }
        Contact contact = new Contact(name, phone, email);
        Address address = new Address(street, city, state);
        User user = new User(contact, address, password);

        userList.add(user);
        //return user;
        return "Signup Successful";
    }

    public String login(String email, String password)
    {
        for(User user : userList)
        {
            if (!email.equals(user.getContact().getEmail())) {
                return "user mail incorrect";
            }

            if(!password.equals(user.getPassword()))
            {
                    return "invalid password";
            }
        }
        return "login successful";
    }
}

