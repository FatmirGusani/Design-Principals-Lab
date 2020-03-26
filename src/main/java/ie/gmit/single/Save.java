/*

Name : Fatmir Gusani
Date : 25.03.2020

This project tests the "The Single Reasonability Principal" & "Open-Closed Principal"
Original code source : https://github.com/plennon2019/singleOpenClosed

*/

package ie.gmit.single;

public class Save {
    private Store store = new Store();

    public void SaveUser(User user)
    {
        store.store(user);
    }
}
