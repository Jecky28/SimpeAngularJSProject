package com.simple.angularjs.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.simple.angularjs.model.User;
import com.simple.angularjs.service.UserService;


@Path("/users")
public class UserResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getDefaultUserInJSON() 
    {
        UserService userService = new UserService();
        return userService.getDefaultUser();
    }
}
