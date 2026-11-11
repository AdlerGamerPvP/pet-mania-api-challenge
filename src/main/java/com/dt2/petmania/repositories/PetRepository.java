package com.dt2.petmania.repositories;

import com.dt2.petmania.entities.Pet;
import org.springframework.stereotype.Repository;

@Repository
public class PetRepository extends CrudRepository<Pet, int>{
}
