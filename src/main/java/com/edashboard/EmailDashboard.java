package com.edashboard;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maverick on 10/10/14.
 */
public class EmailDashboard {

    public void sendMail() throws EmailException {
        Email email = new SimpleEmail();
        List<String> list = new ArrayList<String>();
        list.add("sujit");
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("sujeet100", "<ActualPassword>"));
        email.setSSLOnConnect(true);
        email.setFrom("sujeet100@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("sujeet100@gmail.com");
        email.send();
    }

    public static void main(String args[]) throws EmailException {
        new EmailDashboard().sendMail();
    }
}
