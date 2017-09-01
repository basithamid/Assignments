package com.hibernate.mapping;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Market")
public class Market {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="m_name")
	private String name;
	
	@Column(name="m_city")
	private String city;
	
	@OneToMany(cascade={CascadeType.PERSIST}, 
			fetch=FetchType.EAGER, mappedBy = "market")
	private Set<Stock> stock;
	
	public Market() {}

	public Market(String name, String city) {
		super();
		this.name = name;
		this.city = city;
		
	}
	
	public Market(Long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<Stock> getStock() {
		return stock;
	}

	public void setStock(Set<Stock> stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Market [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}

