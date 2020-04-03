package com.lms.accessingdatajpa.book;

import java.util.HashSet;
import java.util.Set;

//import java.util.HashSet;
//import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.lms.accessingdatajpa.author.Author;

//mark class as an Entity   
@Entity
//defining class name as Table name  
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true) // Defining isbn as unique key
	private String isbn;
	@Column
	private String title;
	@Column
	private int publyear;
	@Column
	private int price;
	@ManyToMany(mappedBy = "books", fetch = FetchType.LAZY)
	private Set<Author> authors = new HashSet<>();

	protected Book() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Book(String isbn, String title, int publyear, int price) {
		this.isbn = isbn;
		this.title = title;
		this.publyear = publyear;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPublyear() {
		return publyear;
	}

	public void setPublyear(int publyear) {
		this.publyear = publyear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

}
