package com.edashboard;

import com.edashboard.bill.Bill;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.mail.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maverick on 10/10/14.
 */
public class EmailDashboard {

    public void sendMail(String msisdn) throws EmailException {

        Client client = Client.create();
        WebResource resource = client.resource("http://localhost:8882/"+msisdn+"/bill");
        ClientResponse response = resource.accept("application/json")
                .get(ClientResponse.class);
        Bill bill = response.getEntity(Bill.class);

        HtmlEmail email = new HtmlEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("sujeet100", "Hangar18Master"));
        email.setSSLOnConnect(true);
        email.setFrom("sujeet100@gmail.com");
        email.setSubject("Your latest bill and much more!");
        email.setHtmlMsg(new EmailBody().getBody(bill));
        email.addTo(bill.getEmail());
        email.send();
    }

    public static void main(String args[]) throws EmailException {
        new EmailDashboard().sendMail("011102021");
    }
}
