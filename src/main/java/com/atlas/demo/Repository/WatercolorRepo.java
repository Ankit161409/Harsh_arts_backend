package com.atlas.demo.Repository;

import com.atlas.demo.Entity.WatercolorPaintings;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WatercolorRepo extends MongoRepository<WatercolorPaintings,String> {
}