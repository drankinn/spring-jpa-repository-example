package com.usana.example.jpa.model.repository.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

/**
 * User: lancea10
 * Date: 4/3/12
 * Time: 5:46 PM
 */
@Entity
public class FishBowl extends AbstractPersistable<Long> {
    private static final long serialVersionUID = -2952756556715107252L;

}
