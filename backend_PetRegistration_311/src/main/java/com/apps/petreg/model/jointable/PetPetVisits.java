package com.apps.petreg.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.petreg.model.PetOwner;
import com.apps.petreg.model.PetVisit;
import com.apps.petreg.model.VeterinaryDoctor;
import com.apps.petreg.model.Vaccine;
import com.apps.petreg.model.Pet;

@Entity(name = "PetPetVisits")
@Table(schema = "\"petreg\"", name = "\"PetPetVisits\"")
@Data
public class PetPetVisits{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PetId\"")
	private Long petId;

    
    @Column(name = "\"ClinicVisitId\"")
    private Long clinicVisitId;
 
}