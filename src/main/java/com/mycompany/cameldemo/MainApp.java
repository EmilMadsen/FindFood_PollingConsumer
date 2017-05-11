package com.mycompany.cameldemo;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;
import org.sql2o.Sql2o;

/**
 * A Camel Application
 */
public class MainApp 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Starting example, press CTRL+C to terminate");

        org.apache.camel.main.Main main = new org.apache.camel.main.Main();
        main.enableHangupSupport();

        main.addRouteBuilder(new RouteBuilder() 
        {
            @Override
            public void configure() throws Exception 
            {
                PropertiesComponent properties = new PropertiesComponent();
                properties.setLocation("classpath:polling.properties");
                getContext().addComponent("properties", properties);

                //from("polling://search/feeds?delay={{delay}}&query={{query}}")


                from("polling://search/feeds?delay={{delay}}&query={{query}}")
                        .split(body())
                        .log(body().toString());


            }
        });

        main.run();
    }
}

