package com.example.demo.controller;
import jakarta.persistence.*;
import java.util.UUID;


@Entity
public class Tracking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private Long Tracknum;
	private Long DelvNum;
	private String SCAC;
	private String EDI;
	
	
//	public Tracking(){
//	}
//	
//	public Tracking(String id, Long Tracknum, Long DelvNum, Timestamp insert, String SCAC, String EDI) {
//		
//	this.id = id;
//	this.Tracknum = Tracknum;
//	this.DelvNum = DelvNum;
//	this.insert = insert;
//	this.SCAC = SCAC;
//	this.EDI = EDI; 
//	
//	}
	
	public Long getID(){
		
		return id;
		
	}
	
	public void setID(){
		
        UUID uuid = UUID.randomUUID();
        Long mostSignificant = uuid.getMostSignificantBits();
		
		this.id = mostSignificant;
	}
	
	public Long getTracknum() {
		return Tracknum;
	}
	
	public void setTracknum(Long Tracknum) {
		this.Tracknum = Tracknum;
	}
	
	public Long getDelvNum() {
		return DelvNum;
	}
	
	public void setDelvNum(Long DelvNum) {
		this.DelvNum = DelvNum;	
	}
	
	public String getSCAC() {
		return SCAC;
	}
	public void setSCAC(String SCAC) {
		this.SCAC = SCAC;
	}
	public String getEDI() {
		return EDI;
	}
	public void setEDI(String EDI) {
		this.EDI = EDI;
	}

}
	