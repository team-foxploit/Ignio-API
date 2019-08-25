package com.foxploit.ignio.userinfoservice.repository;

import com.foxploit.ignio.userinfoservice.domain.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {
    Iterable<? extends Contact> findByStationName(String stationName);
}
