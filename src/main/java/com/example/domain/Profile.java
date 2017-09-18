package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_profiles")
public class Profile {

	@Id
	private Long fno;
	private String fname;
//	private boolean current;
}
