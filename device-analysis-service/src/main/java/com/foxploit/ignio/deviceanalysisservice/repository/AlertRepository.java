package com.foxploit.ignio.deviceanalysisservice.repository;

import com.foxploit.ignio.deviceanalysisservice.domain.Alert;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the Alert entity.
 */
@Repository
public interface AlertRepository extends MongoRepository<Alert, String> {

    Page<Alert> findAllByOwnerId(Pageable pageable, String ownerId);

}
