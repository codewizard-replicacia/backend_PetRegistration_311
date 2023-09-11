package com.apps.petreg.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.apps.petreg.model.PetOwner;
import com.apps.petreg.model.PetVisit;
import com.apps.petreg.model.VeterinaryDoctor;
import com.apps.petreg.model.Vaccine;
import com.apps.petreg.model.Pet;
import com.apps.petreg.converter.DurationConverter;
import com.apps.petreg.converter.UUIDToByteConverter;
import com.apps.petreg.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Pet")
@Table(name = "\"Pet\"", schema =  "\"petreg\"")
@Data
                        
public class Pet {
	public Pet () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"PetId\"", nullable = true )
  private Long petId;
	  
  @Column(name = "\"PetName\"", nullable = true )
  private String petName;
  
	  
  @Column(name = "\"Breed\"", nullable = true )
  private String breed;
  
	  
  @Column(name = "\"Weight\"", nullable = true )
  private Integer weight;
  
	  
  @Column(name = "\"IsVaccinated\"", nullable = true )
  private Boolean isVaccinated;
  
	  
  @Column(name = "\"VaccineName\"", nullable = true )
  private String vaccineName;
  
	  
  @Column(name = "\"VaccineDueDate\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date vaccineDueDate;  
  
	  
  @Column(name = "\"Gender\"", nullable = true )
  private String gender;
  
	  
  @Column(name = "\"PetType\"", nullable = true )
  private String petType;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PetPetVisits\"",
            joinColumns = @JoinColumn( name="\"PetId\""),
            inverseJoinColumns = @JoinColumn( name="\"ClinicVisitId\""), schema = "\"petreg\"")
private List<PetVisit> petVisits = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PetVaccines\"",
            joinColumns = @JoinColumn( name="\"PetId\""),
            inverseJoinColumns = @JoinColumn( name="\"VaccineId\""), schema = "\"petreg\"")
private List<Vaccine> vaccines = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Pet [" 
  + "PetId= " + petId  + ", " 
  + "PetName= " + petName  + ", " 
  + "Breed= " + breed  + ", " 
  + "Weight= " + weight  + ", " 
  + "IsVaccinated= " + isVaccinated  + ", " 
  + "VaccineName= " + vaccineName  + ", " 
  + "VaccineDueDate= " + vaccineDueDate  + ", " 
  + "Gender= " + gender  + ", " 
  + "PetType= " + petType 
 + "]";
	}
	
}