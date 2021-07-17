package one.digitalinnovation.ecommerce.checkout.config;

import one.digitalinnovation.ecommerce.checkout.streaming.CheckoutCreatedSource;
import one.digitalinnovation.ecommerce.checkout.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}
