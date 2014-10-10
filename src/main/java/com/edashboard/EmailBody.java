package com.edashboard;

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

    public String generateEmailBody(){
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER,"classpath");
        velocityEngine.setProperty("classpath.resource.loader.class",ClasspathResourceLoader.class.getName());
        velocityEngine.init();
        Template t = velocityEngine.getTemplate( "test.vm" );
        VelocityContext context = new VelocityContext();
        context.put("message", "hello testing velocity engine");
        StringWriter writer = new StringWriter();
        t.merge(context, writer);
        return  writer.toString();

    }

    public static void main(String args[]) throws EmailException {
        System.out.println(new EmailBody().generateEmailBody());
    }
}
