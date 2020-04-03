package com.lms.accessingdatajpa;
//import java.util.Arrays;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import com.lms.accessingdatajpa.author.Author;
//import com.lms.accessingdatajpa.author.AuthorRepository;
//import com.lms.accessingdatajpa.book.Book;
//import com.lms.accessingdatajpa.book.BookRepository;

@SpringBootApplication
public class AccessingDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class, args);
	}

	
//	@Bean 
//	public CommandLineRunner mappingDemo(AuthorRepository authorrepository,
//			BookRepository bookRepository) 
//	{ 
//	return (args) -> 
//	{ Author author = new Author("John", "Doe", "Abraham"); 
//	  authorrepository.save(author); 
//	  Book book1 =	new Book(123, "Introduction contents", 2019, 800); 
//	  Book book2 = new Book(65,	"Java 8 contents", 2019, 700);
//	  Book book3 = new Book(95,"Concurrency contents", 2019, 900); // save books
//	  bookRepository.saveAll(Arrays.asList(book1, book2, book3)); 
//	  // add books to the author 
//	  author.getBooks().addAll(Arrays.asList(book1, book2, book3));
//	authorrepository.save(author); }; }
	 
}
