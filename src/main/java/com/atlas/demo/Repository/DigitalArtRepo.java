package com.atlas.demo.Repository;

import com.atlas.demo.Entity.DigitalArt;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DigitalArtRepo extends MongoRepository<DigitalArt, String> {
}