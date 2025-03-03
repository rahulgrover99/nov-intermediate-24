package com.example.bookmyshow.repository;

import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking save(Booking entity);

    @Override
    Optional<Booking> findById(Long aLong);
}