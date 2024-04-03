package com.jsp.SpringBoot_Actordb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SpringBoot_Actordb.model.Actor;
import com.jsp.SpringBoot_Actordb.service.ActorService;
import com.jsp.SpringBoot_Actordb.utility.ResponseStructure;

@RestController
public class ActorController 
{
	@Autowired
	private ActorService actorService;
	
//	@RequestMapping(method = RequestMethod.POST, value = "/addActor")
	@PostMapping(value="/addActor")
	public ResponseEntity<ResponseStructure<Actor>> addActor(@RequestBody Actor actor)
	{
			
		return actorService.addActor(actor);
	}
	
	
//	@RequestMapping(method = RequestMethod.GET, value = "/actors/{findByActorId}")
	@GetMapping(value = "/actors/{findByActorId}")
	public  ResponseEntity<ResponseStructure<Actor>> findByActorId(@PathVariable int actorId)
	{
		return actorService.findByActorId(actorId);
		
	}
//	@RequestMapping(method = RequestMethod.PUT, value="/actors/{updateByActorId}")
	@PutMapping(value="/actors/{updateByActorId}")
	public ResponseEntity<ResponseStructure<Actor>> updateByActorId(@PathVariable int actorId, @RequestBody Actor actor)
	{
		return actorService.updateByActorId(actorId, actor);
		
	}
	
//	@RequestMapping(method = RequestMethod.DELETE, value="updateByActorId" )
//	public String ByActorId(@RequestParam int actorId)
//	{
//		return actorService.deleteByActorId(actorId);
//		
//	}
	
//	@RequestMapping(method = RequestMethod.DELETE, value="deleteByActorId" )
//	public Actor ByActorId(@RequestParam int actorId)
//	{
//		return actorService.deleteByActorId(actorId);
//		
//	}
	
//	@RequestMapping(method = RequestMethod.DELETE, value="deleteByActorId" )
	@DeleteMapping( value="deleteByActorId")
	public ResponseEntity<ResponseStructure<Actor>> ByActorId(@RequestParam int actorId)
	{
		return actorService.deleteByActorId(actorId);
		
	}
	
	
//	@RequestMapping(method = RequestMethod.GET, value="findAllActors" )
	@GetMapping(value="findAllActors")
	public ResponseEntity<ResponseStructure<List<Actor>>> findAllActors()
	{
		return actorService.findAllActors();
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value="deleteAllActors" )
	public ResponseEntity<ResponseStructure<List<Actor>>> deleteAllActors()
	{
		return actorService.deleteAllActors();
		
	}
	
	
	
	
		
//	@RequestMapping(value = "/print", method=RequestMethod.GET)
//	public String  print(@RequestParam String name,@RequestParam String city, @RequestParam String nationality)
//	{
//		return name+" belongs to " +city+ " and his nationality "+nationality;
//	}
//	
//	@RequestMapping(value = "/calculate", method=RequestMethod.GET)
//	public int calculate(@RequestParam int num1, @RequestParam int num2)
//	{
//		int sum=num1+num2;
//		return sum;
//	}

		
	}


