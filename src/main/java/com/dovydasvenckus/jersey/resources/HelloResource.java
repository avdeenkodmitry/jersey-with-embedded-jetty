package com.dovydasvenckus.jersey.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Path("world")
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "Hello, world";
    }

}
