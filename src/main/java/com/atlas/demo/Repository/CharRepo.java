package com.atlas.demo.Repository;

import com.atlas.demo.Entity.Charcoal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharRepo extends MongoRepository<Charcoal,String> {
}
