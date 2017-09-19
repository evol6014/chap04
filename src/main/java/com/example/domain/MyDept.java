package com.example.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Data;
import lombok.ToString;

/*
 *  1. One to One
 *  2. One to Many
 *  3. Many to One
 *  4. Many to Many
 */

@Entity
@Table(name = "tbl_dept")
@Data
@ToString(exclude = { "emps" })
public class MyDept {

	@Id
	@TableGenerator(name = "idGen", table = "id_gen", 
					  pkColumnName = "seq_name", valueColumnName = "nextval", 
					  allocationSize = 10, initialValue = 100)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="idGen")
	private Integer deptno;
	private String dname;
	private String loc;

	@OneToMany(mappedBy = "dept", fetch = FetchType.LAZY) // 1 대 다 foreign key
	List<MyEmp> emps; // 이렇게 함으로 MyEmp와 1대n의 관계가 생긴다.
}









