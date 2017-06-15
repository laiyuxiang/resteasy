package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


/**
 * Created by Administrator on 2017/6/15 0015.
 */
@Path("/test")
public class Test {
    @GET
    @Path("/one")
    public Response getAllUsers()
    {
        String result = "<h1>RESTful Demo Application</h1>In real world application, a collection of users will be returned !!";
        return Response.status(200).entity(result).build();
    }
}
