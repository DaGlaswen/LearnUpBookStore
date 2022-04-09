package ru.learnup.bookStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.bookStore.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
