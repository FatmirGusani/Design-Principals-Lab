/*

Name : Fatmir Gusani
Date : 25.03.2020

This project tests the "The Single Reasonability Principal" & "Open-Closed Principal"
Original code source : https://github.com/plennon2019/singleOpenClosed

*/

package ie.gmit.single;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserController {

    //Handles incoming JSON requests that work on User resource/entity

    //Store used by controller
    private Verify verify = new Verify();
    private Save save = new Save();

    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJson, User.class);
        if(!verify.isValidUser(user)) {
            return "ERROR";
        }
        save.SaveUser(user);
        return "SUCCESS";
    }
}

