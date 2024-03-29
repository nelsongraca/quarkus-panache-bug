package com.flowkode.panache;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @Inject
    TestEntityRepository testEntityRepository;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        testEntityRepository.findAll();
        return "hello";
    }
}
