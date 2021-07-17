package one.digitalinnovation.ecommerce.payment.repository;

import one.digitalinnovation.ecommerce.payment.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
