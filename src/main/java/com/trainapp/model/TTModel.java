package com.trainapp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "timetable")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TTModel {
@Id
private String Id;
private String name;
private String trainNumber;
private String origin;
private String destination;
private Date date;
private float fare;
private String departureTime;

}
