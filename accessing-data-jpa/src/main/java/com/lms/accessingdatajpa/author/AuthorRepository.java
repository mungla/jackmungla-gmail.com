package com.lms.accessingdatajpa.author;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

//repository that extends CrudRepository  
	public interface AuthorRepository extends CrudRepository<Author, Long>  
	{  
	
		//public List<Author> findByBookId(Long Id );
}
