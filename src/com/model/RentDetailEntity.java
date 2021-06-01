package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Table(name="rent_detail")
@Entity
@Where(clause="statuss=1")
public class RentDetailEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rent_detail_id")
	private Integer rentDetailId;
	@ManyToOne
	@JoinColumn(name="rent_id")
	private RentEntity rentEntity;
	@ManyToOne
	@JoinColumn(name="book_id")
	private BookEntity bookEntity;
	@ManyToOne
	@JoinColumn(name="user_id")
	private	UserEntity	userEntity;
	/**
	 * @return the rentDetailId
	 */
	public Integer getRentDetailId() {
		return rentDetailId;
	}
	/**
	 * @param rentDetailId the rentDetailId to set
	 */
	public void setRentDetailId(Integer rentDetailId) {
		this.rentDetailId = rentDetailId;
	}
	/**
	 * @return the rentEntity
	 */
	public RentEntity getRentEntity() {
		return rentEntity;
	}
	/**
	 * @param rentEntity the rentEntity to set
	 */
	public void setRentEntity(RentEntity rentEntity) {
		this.rentEntity = rentEntity;
	}
	/**
	 * @return the bookEntity
	 */
	public BookEntity getBookEntity() {
		return bookEntity;
	}
	/**
	 * @param bookEntity the bookEntity to set
	 */
	public void setBookEntity(BookEntity bookEntity) {
		this.bookEntity = bookEntity;
	}
	/**
	 * @return the userEntity
	 */
	public UserEntity getUserEntity() {
		return userEntity;
	}
	/**
	 * @param userEntity the userEntity to set
	 */
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
}
