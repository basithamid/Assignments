package com.spring.advertisement.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Categories")
public class Categories {
	@Id
	@Column(name="name")
	private String categoryName;
	
	@OneToMany(cascade={CascadeType.PERSIST}, fetch=FetchType.EAGER, mappedBy="category")
	private Set<PostAd> advertisement;
	
	public Categories(){}
	public Categories(String categoryName) {
		super();
		this.categoryName = categoryName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "Categories [categoryName=" + categoryName + "]";
	}
}
