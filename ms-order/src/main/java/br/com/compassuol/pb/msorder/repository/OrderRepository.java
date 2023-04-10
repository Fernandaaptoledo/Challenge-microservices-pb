package br.com.compassuol.pb.msorder.repository;

import br.com.compassuol.pb.msorder.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
