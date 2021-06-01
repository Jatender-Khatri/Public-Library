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

@Table(name="book")
@Entity
@Where(clause="statuss=1")
public class BookEntity extends AbstractEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="book_id")
	private Integer bookId;
	@Column(name="title")
	private String title;
	@ManyToOne
	@JoinColumn(name="author_id")
	private AuthorEntity author;
	@Column(name="book_image")
	private String bookImage;
	@Column(name="no_of_copies")
	private Integer noOfCopies;
	@Column(name="book_rent")
	private Double bookRent;
	@ManyToOne
	@JoinColumn(name="category_id")
	private CategoryEntity category;
	/**
	 * @return the bookId
	 */
	public Integer getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public AuthorEntity getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(AuthorEntity author) {
		this.author = author;
	}
	/**
	 * @return the bookImage
	 */
	public String getBookImage() {
		return bookImage;
	}
	/**
	 * @param bookImage the bookImage to set
	 */
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	/**
	 * @return the noOfCopies
	 */
	public Integer getNoOfCopies() {
		return noOfCopies;
	}
	/**
	 * @param noOfCopies the noOfCopies to set
	 */
	public void setNoOfCopies(Integer noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	/**
	 * @return the bookRent
	 */
	public Double getBookRent() {
		return bookRent;
	}
	/**
	 * @param bookRent the bookRent to set
	 */
	public void setBookRent(Double bookRent) {
		this.bookRent = bookRent;
	}
	/**
	 * @return the category
	 */
	public CategoryEntity getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
	
}
