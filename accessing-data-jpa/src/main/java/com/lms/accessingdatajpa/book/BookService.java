package com.lms.accessingdatajpa.book;
//import java.util.ArrayList;
//import java.util.List;
//import com.lms.accessingdatajpa.book.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookService {
	//@Autowired 	
//private BookRepository bookRepository;


	
	/*public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
		
	}
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		bookRepository.findAll()
		.forEach(books::add); 
		return books; }
	

	 * public Book getBook(int isbn) { // TODO Auto-generated method stub return
	 * return bookRepository.findById(isbn).get(); }
	 * 
	 * public void updateBook(int isbn, Book book) { // TODO Auto-generated method
	 * stub bookRepository.save(book);
	 * 
	 * }
	 * 
	 * public void deleteBook(int isbn) { // TODO Auto-generated method stub
	 * bookRepository.deleteById(isbn); }
	 */
}