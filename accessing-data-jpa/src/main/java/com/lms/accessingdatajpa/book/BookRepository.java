package com.lms.accessingdatajpa.book;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

//repository that extends CrudRepository  
	public interface BookRepository extends CrudRepository<Book, Long>  
	{  
	
		//List<Book> findByTitle(String title);
		//Book findByIsbn (int isbn);
		
}
