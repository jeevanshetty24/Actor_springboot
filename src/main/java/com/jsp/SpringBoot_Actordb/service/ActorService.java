package com.jsp.SpringBoot_Actordb.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jsp.SpringBoot_Actordb.model.Actor;
import com.jsp.SpringBoot_Actordb.utility.ResponseStructure;

public interface ActorService {

//	public Actor addActor(Actor actor);
	
	public ResponseEntity<ResponseStructure<Actor>>addActor(Actor actor);
		
	public ResponseEntity<ResponseStructure<Actor>> findByActorId(int actorId);
	
//	public Actor updateByActorId(int actorId, Actor updatedActor);
	
	public ResponseEntity<ResponseStructure<Actor>> updateByActorId(int actorId, Actor updatedActor);
	
	
	
//	public String deleteByActorId(int actorId);
	
	public ResponseEntity<ResponseStructure<Actor>>deleteByActorId(int actorId);
	
	public ResponseEntity<ResponseStructure<List<Actor>>> findAllActors();
	
	public ResponseEntity<ResponseStructure<List<Actor>>> deleteAllActors();
	
}
