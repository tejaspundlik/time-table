package com.trainapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.trainapp.dto.TTResponse;
import com.trainapp.model.TTModel;
import com.trainapp.service.TTService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/timetable")
public class TTController {
@Autowired
private TTService service;
@GetMapping("/{name}")
public List<TTResponse> getTrainTimeTable(@PathVariable String name) {
    return service.getByName(name);
}
@PostMapping
public String postObj(@RequestBody TTModel obj) {
    service.addTT(obj);
    return "DONE :D";
}


}
