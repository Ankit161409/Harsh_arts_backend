package com.atlas.demo.Repository;


import com.atlas.demo.Entity.ColouredPencil;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ColouredPencilRepo extends
        MongoRepository<ColouredPencil, String> {
}
