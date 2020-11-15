package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;
// import javax.management.Query;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

import com.example.accessingdatamysql.Dog;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DogRepository extends CrudRepository<Dog, Integer> {
    
    @Query("from Dog where name like %:keyword%") // JPA requires table provided here match to model, not necessarily SQL table
    public List<Dog> findByName(String keyword);
    
}