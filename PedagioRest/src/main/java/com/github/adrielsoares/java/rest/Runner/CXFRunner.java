package com.github.adrielsoares.java.rest.Runner;

/**
 * Created by adriel on 06/06/17.
 */

import com.github.adrielsoares.java.rest.ConfigucoesSpring.ConfiguracaoApp;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class CXFRunner {
    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);

        final ServletHolder servletHolder = new ServletHolder(new CXFServlet());
        final ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");
        context.addServlet(servletHolder, "/rest/*");
        context.addEventListener(new ContextLoaderListener());

        context.setInitParameter("contextClass", AnnotationConfigWebApplicationContext.class.getName());
        context.setInitParameter("contextConfigLocation", ConfiguracaoApp.class.getName());
        server.setHandler(context);

        server.start();
        server.join();
    }
}