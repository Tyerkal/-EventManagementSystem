package com.eventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventManagement.model.Venue;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {
}

