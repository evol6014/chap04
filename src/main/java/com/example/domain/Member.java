package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_members")
public class Member {

	@Id
	private Integer deptno;
	private String dname;
	private String loc;
	
}
