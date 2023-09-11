package com.apps.petreg.repository;


import com.apps.petreg.model.VeterinaryDoctor;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class VeterinaryDoctorRepository extends SimpleJpaRepository<VeterinaryDoctor, String> {
    private final EntityManager em;
    public VeterinaryDoctorRepository(EntityManager em) {
        super(VeterinaryDoctor.class, em);
        this.em = em;
    }
    @Override
    public List<VeterinaryDoctor> findAll() {
        return em.createNativeQuery("Select * from \"petreg\".\"VeterinaryDoctor\"", VeterinaryDoctor.class).getResultList();
    }
}