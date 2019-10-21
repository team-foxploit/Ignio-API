package com.foxploit.ignio.gateway.repository;

import com.foxploit.ignio.gateway.domain.BillingInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the BillingInfo entity.
 */

@Repository
public interface BillingInfoRepository extends MongoRepository<BillingInfo, String> {

}
