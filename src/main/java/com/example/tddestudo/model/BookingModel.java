package com.example.tddestudo.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BookingModel {
    private String id;
    private String reserveName;
    private LocalDate checkIn;
    private LocalDate checkout;
    private int numberGuest;
}
