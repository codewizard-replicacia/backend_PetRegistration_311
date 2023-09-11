package com.apps.petreg.repository;


import com.apps.petreg.model.Vaccine;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class VaccineRepository extends SimpleJpaRepository<Vaccine, String> {
    private final EntityManager em;
    public VaccineRepository(EntityManager em) {
        super(Vaccine.class, em);
        this.em = em;
    }
    @Override
    public List<Vaccine> findAll() {
        return em.createNativeQuery("Select * from \"petreg\".\"Vaccine\"", Vaccine.class).getResultList();
    }
}