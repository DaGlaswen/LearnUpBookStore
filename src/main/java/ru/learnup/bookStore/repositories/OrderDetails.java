package ru.learnup.bookStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetails extends JpaRepository<OrderDetails, Long> {
}
