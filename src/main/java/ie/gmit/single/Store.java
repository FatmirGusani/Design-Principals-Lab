/*

Name : Fatmir Gusani
Date : 25.03.2020

This project tests the "The Single Reasonability Principal" & "Open-Closed Principal"
Original code source : https://github.com/plennon2019/singleOpenClosed

*/

package ie.gmit.single;

import java.util.HashMap;
import java.util.Map;

//Stores data in memory
public class Store {

    private static final Map<String, User> STORAGE = new HashMap<>();

    public void store(User user) {
        synchronized(STORAGE) {
            STORAGE.put(user.getName(), user);
        }
    }

    public User getUser(String name) {
        synchronized(STORAGE) {
            return STORAGE.get(name);
        }
    }
}