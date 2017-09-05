package com.spring.advertisement.entity;

import javax.persistence.*;

@Entity
@Table(name="Advertisements")
public class PostAd {

	@Id
	@GeneratedValue
	@Column(name="AD_ID")
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@ManyToOne(cascade={CascadeType.PERSIST}, fetch=FetchType.EAGER)
	@JoinColumn(name="Publisher")
	private User user;
	
	@ManyToOne(cascade={CascadeType.PERSIST}, fetch=FetchType.EAGER)
	@JoinColumn(name="category_name")
	private Categories category;
	
	@Column(name="Ad_Description")
	private String desc;
	
	public PostAd(){}

	public PostAd(String title, User user, Categories category, String desc) {
		super();
		this.title = title;
		this.user = user;
		this.category = category;
		this.desc = desc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "PostAd [id=" + id + ", title=" + title + ", user=" + user + ", category=" + category + ", desc="
				+ desc + "]";
	}
	
	
}

