package it.janczewski.server.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by tomasz on 28.03.15.
 */
@Path("test")
public class MainWS {

    @GET
    @Path("/details/{param}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAccountDetails(@PathParam("param") String accountName) {
        String output = "Name : " + accountName;
        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("/ping")
    @Produces("application/json")
    public Response ping(){
        return Response.status(200).entity("pong").build();
    }
}
