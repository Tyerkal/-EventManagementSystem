package com.eventManagement.service;


import com.eventManagement.model.Organizer;
import com.eventManagement.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizerService {

    @Autowired
    private OrganizerRepository organizerRepository;

    public Organizer createOrganizer(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    public Organizer getOrganizerById(Long id) {
        return organizerRepository.findById(id).orElse(null);
    }

    public Organizer updateOrganizer(Long id, Organizer organizerDetails) {
        return organizerRepository.findById(id).map(organizer -> {
            organizer.setName(organizerDetails.getName());
            organizer.setContactInfo(organizerDetails.getContactInfo());
            return organizerRepository.save(organizer);
        }).orElse(null);
    }

    public void deleteOrganizer(Long id) {
        organizerRepository.deleteById(id);
    }
}

