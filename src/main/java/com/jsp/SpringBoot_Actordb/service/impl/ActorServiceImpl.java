package com.jsp.SpringBoot_Actordb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.SpringBoot_Actordb.exception.ActorNotFoundException;
import com.jsp.SpringBoot_Actordb.model.Actor;
import com.jsp.SpringBoot_Actordb.repository.ActorRepository;
import com.jsp.SpringBoot_Actordb.service.ActorService;
import com.jsp.SpringBoot_Actordb.utility.ResponseStructure;


@Service
public class ActorServiceImpl implements ActorService
{
	@Autowired
	private ActorRepository actorRepository;



	@Override
	public ResponseEntity<ResponseStructure< Actor>> findByActorId(int actorId)
	{
		  Optional<Actor>optional=actorRepository.findById(actorId);
		  
		  if(optional.isPresent())
		  {
			  Actor actor=optional.get();
			  
			   ResponseStructure<Actor>responseStructure=new ResponseStructure<>();
			   responseStructure.setStatuscode(HttpStatus.FOUND.value());
			   responseStructure.setMessage("Actor Object Found Successfully");
			   responseStructure.setData(actor);
			   
			   return  new ResponseEntity<ResponseStructure<Actor>>(responseStructure, HttpStatus.FOUND); 
		  }
		  else
		  {
			  throw new ActorNotFoundException("Actor not Found");
	}

}

	@Override
	public ResponseEntity<ResponseStructure< Actor>> updateByActorId(int actorId, Actor updatedActor)
	{
		Optional<Actor>optional=actorRepository.findById(actorId);
		
		if(optional.isPresent())
		{
			Actor existingActor=optional.get();
			updatedActor.setActorId(existingActor.getActorId());
			
			Actor actor=actorRepository.save(updatedActor);
			
			
			
//			  existingActor.setActorName(updatedActor.getActorName());
//		        existingActor.setActorAge(updatedActor.getActorAge());
//		        existingActor.setActorAddress(updatedActor.getActorAddress());
//		        existingActor.setNationality(updatedActor.getNationality());
//		        existingActor.setIndustry(updatedActor.getIndustry());
			
//			  Actor savedActor = actorRepository.save(existingActor);
			
			  ResponseStructure<Actor>responseStructure=new ResponseStructure<>();
			   responseStructure.setStatuscode(HttpStatus.OK.value());
			   responseStructure.setMessage("Actor  Updated Successfully");
			   responseStructure.setData(actor);
			   return  new ResponseEntity<ResponseStructure<Actor>>(responseStructure, HttpStatus.CREATED);
			
//			Actor existingActor=optional.get();
//			updatedActor.setActorId(existingActor.getActorId());
//			return actorRepository.save(updatedActor);
		}
		else{
		return null;
	}}

	@Override
	public ResponseEntity<ResponseStructure< Actor>> deleteByActorId(int actorId) {
		Optional<Actor>optional=actorRepository.findById(actorId);
		
		if(optional.isPresent())
		{
			Actor actor=optional.get();
			actorRepository.delete(actor);
			
			   ResponseStructure<Actor>responseStructure=new ResponseStructure<>();
			   responseStructure.setStatuscode(HttpStatus.CREATED.value());
			   responseStructure.setMessage("Actor Object Deleted Successfully");
			   responseStructure.setData(actor);
			   
			   return  new ResponseEntity<ResponseStructure<Actor>>(responseStructure, HttpStatus.CREATED);
			
//			actorRepository.delete(actor);
//			return actor;
		}
		else {
		return null;
	}

//	@Override
//	public String deleteByActorId(int actorId)
//	{
//		actorRepository.deleteById(actorId);
//		
//		return "Deleted Successfully.....!";
//	}
	}

//	@Override
//	public   List<Actor> findAllActors() 
//	{
//		List<Actor>actors=actorRepository.findAll();
//		
//		if(actors.isEmpty())
//		{
//			return null;
//		}
//		else {
//			return actors;
//		}
//	}
	
	
	@Override
	public ResponseEntity<ResponseStructure<List<Actor>>> findAllActors() {
	    List<Actor> actors = actorRepository.findAll();
	    ResponseStructure<List<Actor>>responseStructure=new ResponseStructure<>();
	    
	    if (actors.isEmpty()) 
	    {
	    	responseStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
			responseStructure.setMessage("No Data Available.....!");
			responseStructure.setData(null);
	    	
	        return new ResponseEntity< ResponseStructure<List<Actor>>>(responseStructure,HttpStatus.NOT_FOUND);
	    }
	    else 
	    {
	    	responseStructure.setStatuscode(HttpStatus.FOUND.value());
			responseStructure.setMessage("Actor Objects Found");
			responseStructure.setData(actors);
	        return new ResponseEntity< ResponseStructure<List<Actor>>>(responseStructure,HttpStatus.FOUND);	
			     
	    }
	}
	
	@Override
	public ResponseEntity<ResponseStructure<Actor>>addActor(Actor actor)
	{
	   Actor actor1=actorRepository.save(actor);
	   
	   ResponseStructure<Actor>responseStructure=new ResponseStructure<>();
	   responseStructure.setStatuscode(HttpStatus.CREATED.value());
	   responseStructure.setMessage("Actor Object created Successfully");
	   responseStructure.setData(actor1);
	   
	   return  new ResponseEntity<ResponseStructure<Actor>>(responseStructure, HttpStatus.CREATED);
	}

@Override
public ResponseEntity<ResponseStructure<List<Actor>>> deleteAllActors() {
    List<Actor> actors = actorRepository.findAll();
    ResponseStructure<List<Actor>>responseStructure=new ResponseStructure<>();
    
    if (actors.isEmpty()) 
    {
    	responseStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		responseStructure.setMessage("No Data Available To Delete.....!");
		responseStructure.setData(null);
    	
        return new ResponseEntity< ResponseStructure<List<Actor>>>(responseStructure,HttpStatus.NOT_FOUND);
    }
    else 
    {
    	responseStructure.setStatuscode(HttpStatus.FOUND.value());
		responseStructure.setMessage("Actor Objects Found");
		responseStructure.setData(actors);
        return new ResponseEntity< ResponseStructure<List<Actor>>>(responseStructure,HttpStatus.FOUND);	
		     
    } 
     }
       }