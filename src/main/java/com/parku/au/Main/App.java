package com.parku.au.Main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.parku.au.POJO.User;


@Path("user")
public class App 
{
  @GET
  @Path("username")
  @Produces(MediaType.APPLICATION_JSON)
  public User showUser(){
	  
	  User user = new User();
	  user.setUsername("anjanet");
	  return user;
  }
}
