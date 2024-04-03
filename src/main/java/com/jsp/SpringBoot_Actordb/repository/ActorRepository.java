package com.jsp.SpringBoot_Actordb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.SpringBoot_Actordb.model.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer>
{


}
