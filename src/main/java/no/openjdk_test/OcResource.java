package no.openjdk_test;

import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class OcResource {

    @GET
    public String hello(){
        return "hello";
    }

}
