package com.mycompany.cameldemo.databases.publisher;

import com.mycompany.cameldemo.model.Allergy;
import org.sql2o.Connection;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Emilo on 11-05-2017.
 */
public class AllergyRepository extends PublisherRepository
{
    public AllergyRepository()
    {
        super();
    }

    public Collection<Allergy> getAll(Date lastPoll)
    {
        System.out.println(lastPoll.getTime());
        Collection<Allergy> allergies;
        String sql =
                "SELECT allergyId, allergyName, allergyDescription " +
                        "FROM Allergies WHERE createdDate >= :lastPoll";
        try{
            Connection con = getSql2o().open();
            allergies = con.createQuery(sql)
                    .addParameter("lastPoll",lastPoll.getTime())
                    .executeAndFetch(Allergy.class);
        }catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
        return allergies;
    }
}
