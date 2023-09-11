package com.apps.petreg.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.petreg.model.PetOwner;
import com.apps.petreg.model.PetVisit;
import com.apps.petreg.model.VeterinaryDoctor;
import com.apps.petreg.model.Vaccine;
import com.apps.petreg.model.Pet;

@Entity(name = "PetOwnerContacts")
@Table(schema = "\"petreg\"", name = "\"PetOwnerContacts\"")
@Data
public class PetOwnerContacts{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PetOwnerId\"")
	private Long petOwnerId;

    
    @Column(name = "\"Contacts\"")
    private Long contacts;
}