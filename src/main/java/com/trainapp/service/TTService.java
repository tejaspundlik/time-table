package com.trainapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainapp.dto.TTResponse;
import com.trainapp.model.TTModel;
import com.trainapp.repository.TTRepo;

@Service
public class TTService {

    @Autowired 
    private TTRepo repository;

    public List<TTResponse> getByName(String name){
        List<TTModel> model_obj = repository.findByName(name);
        return model_obj.stream().map(this::mapTTToResponse).toList();

    }

    public TTResponse mapTTToResponse(TTModel obj){
        return TTResponse.builder().date(obj.getDate())
        .departureTime(obj.getDepartureTime())
        .destination(obj.getDestination())
        .origin(obj.getOrigin())
        .fare(obj.getFare())
        .name(obj.getName())
        .trainNumber(obj.getTrainNumber()).build();
    }

    public void addTT(TTModel obj){
        repository.save(obj);
    }
}
