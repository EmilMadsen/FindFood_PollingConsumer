package com.mycompany.cameldemo.databases.publisher;

import org.sql2o.Sql2o;

/**
 * Created by Emilo on 11-05-2017.
 */
public class PublisherRepository
{
    private static Sql2o sql2o;
    private final static String DB_URL = "mysql://80.255.6.114:3306/FindFood_Publisher"; // Use when developing to test on localhost
//    public final static String DB_URL = "mysql://localhost:3306/FindFood_Publisher"; // Use when creating Jar-file to be run on server
    private final static String DB_USER = "FF_Publisher";
    private final static String DB_PASS = "yQjS6yiA";

    public PublisherRepository()
    {
        if(PublisherRepository.sql2o == null)
        {
            PublisherRepository.sql2o = new Sql2o(DB_URL, DB_USER, DB_PASS);
        }
    }

    protected static Sql2o getSql2o() {
        return sql2o;
    }
}
