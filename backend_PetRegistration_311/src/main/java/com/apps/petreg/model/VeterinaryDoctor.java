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

@Entity(name = "VeterinaryDoctor")
@Table(name = "\"VeterinaryDoctor\"", schema =  "\"petreg\"")
@Data
                        
public class VeterinaryDoctor {
	public VeterinaryDoctor () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"DoctorId\"", nullable = true )
  private Integer doctorId;
	  
  @Column(name = "\"DoctorName\"", nullable = true )
  private String doctorName;
  
	  
  @Column(name = "\"Qualification\"", nullable = true )
  private String qualification;
  
	  
  @Column(name = "\"Specialization\"", nullable = true )
  private String specialization;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "VeterinaryDoctor [" 
  + "DoctorId= " + doctorId  + ", " 
  + "DoctorName= " + doctorName  + ", " 
  + "Qualification= " + qualification  + ", " 
  + "Specialization= " + specialization 
 + "]";
	}
	
}