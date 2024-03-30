package com.trainapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import com.trainapp.model.TTModel;

public interface TTRepo extends MongoRepository<TTModel,String> {

    List<TTModel> findByName(String name);
}
