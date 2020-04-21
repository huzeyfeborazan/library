package com.bootcamp.library.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ChildrenBook extends Book {
	
	@Column
	private Integer level;

}
