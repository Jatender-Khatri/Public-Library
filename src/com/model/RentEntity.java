package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Table(name="rent")
@Entity
@Where(clause="statuss=1")
public class RentEntity extends AbstractEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rent_id")
	private Integer rentId;
	@Column(name="rent_date")
	private String rentDate;
	@Column(name="due_date")
	private String dueDate;
	@Column(name="total_rent")
	private Double totalRent;
	/**
	 * @return the rentId
	 */
	public Integer getRentId() {
		return rentId;
	}
	/**
	 * @param rentId the rentId to set
	 */
	public void setRentId(Integer rentId) {
		this.rentId = rentId;
	}
	/**
	 * @return the rentDate
	 */
	public String getRentDate() {
		return rentDate;
	}
	/**
	 * @param rentDate the rentDate to set
	 */
	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}
	/**
	 * @return the dueDate
	 */
	public String getDueDate() {
		return dueDate;
	}
	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	/**
	 * @return the totalRent
	 */
	public Double getTotalRent() {
		return totalRent;
	}
	/**
	 * @param totalRent the totalRent to set
	 */
	public void setTotalRent(Double totalRent) {
		this.totalRent = totalRent;
	}
	
}
