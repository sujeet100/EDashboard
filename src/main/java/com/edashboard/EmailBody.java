package com.edashboard;

import com.edashboard.bill.Bill;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;
import org.apache.commons.mail.EmailException;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;

/**
 * Created by maverick on 10/10/14.
 */
public class EmailBody {

    public String getBody(Bill bill) {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER,"classpath");
        velocityEngine.setProperty("classpath.resource.loader.class",ClasspathResourceLoader.class.getName());
        velocityEngine.init();
        Template t = velocityEngine.getTemplate( "billTemplate.vm" );
        VelocityContext context = new VelocityContext();
        context.put("bill", bill);
        StringWriter writer = new StringWriter();
        t.merge(context, writer);
        return  writer.toString();
    }
}
