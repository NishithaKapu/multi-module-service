package producerService;

import model.DeliveryDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerDeliveryService {

    @Autowired
    KafkaTemplate<Long, DeliveryDetails> kafkaTemplate;

    public void sendDeliveryDetails(DeliveryDetails deliveryDetails){
        kafkaTemplate.send("delivery-topic", deliveryDetails.getId(), deliveryDetails);
    }

}
