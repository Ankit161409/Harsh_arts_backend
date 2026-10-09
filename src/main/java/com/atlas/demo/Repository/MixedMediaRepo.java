package com.atlas.demo.Repository;

import com.atlas.demo.Entity.MixedMedia;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MixedMediaRepo extends MongoRepository<MixedMedia, String> {
}