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
<<<<<<< HEAD
                SendingProcessor processor = new SendingProcessor();
                
//                from("polling://queryDatabase").split(body()).split(body()).log(body().toString());
                from("polling://queryDatabase").split(body()).split(body()).process(processor);
                
=======

                //from("polling://search/feeds?delay={{delay}}&query={{query}}")


                from("polling://search/feeds?delay={{delay}}&query={{query}}")
                        .split(body())
                        .log(body().toString());
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e


            }
        });

        main.run();
    }
}

