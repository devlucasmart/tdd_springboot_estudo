package com.example.tddestudo.service;

import com.example.tddestudo.model.BookingModel;
import com.example.tddestudo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;
    public int daysCalculatorWithDatabase(String name) {
        Optional<BookingModel> bookingModelOptional = bookingRepository.findByReserveName(name);
        return Period.between(bookingModelOptional.get().getCheckIn(), bookingModelOptional.get().getCheckout()).getDays();
    }
}
