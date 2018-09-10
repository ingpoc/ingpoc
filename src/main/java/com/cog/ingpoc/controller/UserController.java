package com.cog.ingpoc.controller;

import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cog.ingpoc.data.User;
import com.cog.ingpoc.model.UserForm;
import com.cog.ingpoc.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ResponseHeader;

@Component
@Path("/users")
@Api(value = "User resource", produces = "application/json")
public class UserController {

	@Autowired
	public UserService userService; 
	

	@POST
	@Path("/create")
	@Consumes("application/json")
	@Produces("application/json")
	@ApiOperation(value = "Creates User resource. Accepts : UserData as input ", response = User.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "User resource created", responseHeaders = {
					@ResponseHeader(name = "Location", description = "The URL to retrieve created resource", response = User.class)
			}),
			@ApiResponse(code = 404, message = "Failed to create User resource ")
	})	
	public Response create(User user) {
		
		
		 user = userService.createUser(user);
	
			
				return Response.status(404).entity(user).build();
		
		
	}

}
