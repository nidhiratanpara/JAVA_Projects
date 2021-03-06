package com.nidhi.RestApp.messanger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nidhi.RestApp.messanger.service.MessageService;


import com.nidhi.RestApp.messanger.model.*;
@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
	
	MessageService ms=new MessageService();
	
	@GET
	public List<Message> getMessage()
	{
		return ms.getAllMessages();
		
	}
	
	@GET
	@Path("/{messageId}")
	
	public Message getMessage(@PathParam("messageId")  long id)
	{
		return ms.getMessage(id);
	}
	
	@POST
	
	public Message addMessage(Message message)
	{
		return ms.addMessage(message);
	}
	
	
	
	@PUT
	@Path("/{mesaageId}")
	
	public Message updateMessage(@PathParam("mesaageId") long id,Message message)
	{
		message.setId(id);
		return ms.updateMessage(message);
	}
	
	@DELETE
	@Path("/{mesaageId}")
	
	public void deleteMessage(@PathParam("mesaageId") long id)
	{
		 ms.removeMessage(id);
	}
	
	
}
	

