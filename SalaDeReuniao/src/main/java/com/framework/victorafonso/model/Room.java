package com.framework.victorafonso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "meetingroom")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "date", nullable = false)
	private String date;
	
	@Column(name = "startHour", nullable = false)
	private String startHour;
	
	@Column(name = "endHour", nullable = false)
	private String endHour;

	public Room() {

	}

	public Room(long id, String name, String date, String startHour, String endHour) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.startHour = startHour;
		this.endHour = endHour;
	}
	
	@Override
	public String toString() {
		return String.format("Room [id=%d, name=%s, startHour=%s, endHour=%s]", id, name, startHour, endHour);
	}
}
