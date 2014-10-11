package com.edashboard;

import org.apache.commons.mail.EmailException;

/**
 * Created by maverick on 11/10/14.
 */
public class ThresholdReportGenerator {
    public static void main(String args[]) throws EmailException {
        new EmailDashboard().sendThresholdMail("011102021");
    }
}
