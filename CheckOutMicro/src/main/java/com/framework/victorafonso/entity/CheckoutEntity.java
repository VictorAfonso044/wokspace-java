package com.framework.victorafonso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Builder;
import lombok.Data;

@Builder
@Entity
@Data
public class CheckoutEntity {

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String code;
	@Column
	@Enumerated(EnumType.STRING)
	private Status status;

	public enum Status {
		CRETED, APPROVED
	}
}
