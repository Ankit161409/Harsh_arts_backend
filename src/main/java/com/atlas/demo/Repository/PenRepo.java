package com.atlas.demo.Repository;

import com.atlas.demo.Entity.Pen;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PenRepo extends MongoRepository<Pen, String> {
}