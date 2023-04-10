package br.com.compassuol.pb.msorder.repository;

import br.com.compassuol.pb.msorder.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
