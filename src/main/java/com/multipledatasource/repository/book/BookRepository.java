package com.multipledatasource.repository.book;

import com.multipledatasource.model.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Abdur Rahim Nishad
 * @since 2021/28/03
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
