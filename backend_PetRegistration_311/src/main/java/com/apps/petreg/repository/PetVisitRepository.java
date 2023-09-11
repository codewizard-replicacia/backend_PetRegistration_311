package com.apps.petreg.repository;


import com.apps.petreg.model.PetVisit;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PetVisitRepository extends SimpleJpaRepository<PetVisit, String> {
    private final EntityManager em;
    public PetVisitRepository(EntityManager em) {
        super(PetVisit.class, em);
        this.em = em;
    }
    @Override
    public List<PetVisit> findAll() {
        return em.createNativeQuery("Select * from \"petreg\".\"PetVisit\"", PetVisit.class).getResultList();
    }
}