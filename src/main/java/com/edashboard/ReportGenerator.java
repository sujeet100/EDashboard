package com.edashboard;

import org.apache.commons.mail.EmailException;

/**
 * Created by maverick on 10/10/14.
 */
public class ReportGenerator {

    public static void main(String args[]) throws EmailException {
        String msisdn = args[0];
        new EmailDashboard().sendMail(msisdn);
    }
}
