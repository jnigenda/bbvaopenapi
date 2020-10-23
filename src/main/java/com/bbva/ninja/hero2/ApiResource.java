package com.bbva.ninja.hero2;

import java.lang.Object;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/api")
public interface ApiResource {
  @Path("/heroes/{id}")
  @GET
  void generatedMethod1(@PathParam("id") Object id);

  @Path("/heroes/{nombre}/")
  @GET
  void generatedMethod2(@PathParam("nombre") Object nombre);
}
