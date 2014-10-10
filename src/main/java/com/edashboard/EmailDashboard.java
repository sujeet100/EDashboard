package com.edashboard;

import org.apache.commons.mail.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maverick on 10/10/14.
 */
public class EmailDashboard {

    public void sendMail(String msisdn) throws EmailException {
        HtmlEmail email = new HtmlEmail();
        List<String> list = new ArrayList<String>();
        list.add("sujit");
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("sujeet100", "Hangar18Master"));
        email.setSSLOnConnect(true);
        email.setFrom("sujeet100@gmail.com");
        email.setSubject("TestMail");
        email.setHtmlMsg(new EmailBody().generateEmailBody(msisdn));
        email.addTo("vibhor.mahajan@cognizant.com");
        email.send();
    }

    public static void main(String args[]) throws EmailException {
        new EmailDashboard().sendMail("011102021");
    }
}
