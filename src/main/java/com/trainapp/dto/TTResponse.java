package com.trainapp.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TTResponse {
private String name;
private String trainNumber;
private String origin;
private String destination;
private Date date;
private float fare;
private String departureTime;
}
