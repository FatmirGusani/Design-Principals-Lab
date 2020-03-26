/*

Name : Fatmir Gusani
Date : 25.03.2020

This project tests the "The Single Reasonability Principal" & "Open-Closed Principal"
Original code source : https://github.com/plennon2019/singleOpenClosed

*/

package ie.gmit.open;

import java.util.List;

public class ISPSubscriber extends DuplicateCode {

    public ISPSubscriber(long subscriberId, String address, long phoneNumber, int baseRate, int freeUsage) {
        super(subscriberId, address, phoneNumber, baseRate, freeUsage);
    }

    public double calculateBill(long subscriberId,int freeUsage, int baseRate ) {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData*baseRate/100;
    }
}