package com.sukla.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sukla.entity.Player;

//@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer>
{
	
}
