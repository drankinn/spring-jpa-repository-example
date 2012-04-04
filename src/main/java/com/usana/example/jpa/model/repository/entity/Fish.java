package com.usana.example.jpa.model.repository.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * User: lancea10
 * Date: 4/3/12
 * Time: 6:05 PM
 */
public class Fish extends AbstractPersistable<Long> {
    private static final long serialVersionUID = 2952565510734577852L;

    private Enum<FishColor> color;
    private Enum<FishSpecies> specie;
    private Integer age;
    private Enum<Wellness> health;
    @ManyToOne
    private Fish father;
    @ManyToOne
    private Fish mother;
    @OneToMany
    private List<Fish> children;

}
