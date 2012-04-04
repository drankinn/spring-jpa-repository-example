package com.usana.example.jpa.model.repository;

import com.usana.example.jpa.model.repository.entity.FishBowl;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

/**
 * User: lancea10
 * Date: 4/3/12
 * Time: 5:45 PM
 */
public class FishBowlRepository extends SimpleJpaRepository<FishBowl, Long> {


    public FishBowlRepository(Class<FishBowl> domainClass, EntityManager em) {
        super(domainClass, em);
    }
}
