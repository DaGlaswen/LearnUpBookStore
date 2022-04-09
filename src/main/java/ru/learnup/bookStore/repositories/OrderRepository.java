package ru.learnup.bookStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.learnup.bookStore.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
