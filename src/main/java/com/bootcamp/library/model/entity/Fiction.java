package com.bootcamp.library.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Fiction extends Book {
	
	@Column
	private String category;

}
