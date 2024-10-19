package com.censoia.angola.controllers;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import java.io.InputStream;

@Path("/families")
public class FamilyResource {

    @POST
    @Path("/json")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response receiveJsonFamilyData(String jsonData) {

        return Response.ok().build();
    }

    @POST
    @Path("/upload")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response uploadeFiles(@FormDataParam("file")InputStream fileInputStream, @FormDataParam("file")FormDataContentDisposition filrDetail) {

        return Response.ok().build();
    }

}
