package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/add")
public class AddResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(@QueryParam("first") int first, @QueryParam("second") int second) {
        CalculationResult additionResult = new CalculationResult(first + second);
        return Response.ok(additionResult).build();
    }
}