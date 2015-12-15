package com.grandland.autoupdate.server;

import com.grandland.autoupdate.server.conf.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * WebAppInitializer
 *
 * @author Allen Jin
 * @date 2015-11-06
 */
public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext dispatcherServlet = new AnnotationConfigWebApplicationContext();
        dispatcherServlet.register(AppConfig.class);

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
                "dispatcher", new DispatcherServlet(dispatcherServlet));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

    }

}
