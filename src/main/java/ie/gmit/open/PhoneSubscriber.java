/*

Name : Fatmir Gusani
Date : 25.03.2020

This project tests the "The Single Reasonability Principal" & "Open-Closed Principal"
Original code source : https://github.com/plennon2019/singleOpenClosed

*/

package ie.gmit.open;

import java.util.List;

public class PhoneSubscriber extends DuplicateCode {

    public PhoneSubscriber(long subscriberId, String address, long phoneNumber, int baseRate, int freeUsage) {
        super(subscriberId, address, phoneNumber, baseRate, freeUsage);
    }

    public double calculateBill(long subscriberId, int baseRate) {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }
}