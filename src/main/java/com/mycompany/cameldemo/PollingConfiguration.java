/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cameldemo;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;


@UriParams
public class PollingConfiguration
{
    @UriParam
    private String query;

    @UriParam(defaultValue = "60000")
<<<<<<< HEAD
    private int delay = 20000;
=======
    private int delay = 10000;
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e

    public int getDelay() 
    {
        return delay;
    }

    public void setDelay(int delay) 
    {
        this.delay = delay;
    }

    public String getQuery() 
    {
        return query;
    }

    public void setQuery(String query) 
    {
        this.query = query;
    }
}
