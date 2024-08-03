package com.eventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventManagement.model.Organizer;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
}
