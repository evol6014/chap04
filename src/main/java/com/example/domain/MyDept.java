package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_dept")
@Data
public class MyDept {

	@Id
	private Integer deptno;
	private String dname;
	private String loc;
	
}
