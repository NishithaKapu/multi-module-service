package consumerService;

import ConsumerDao.DeliveryRepository;
import consumerModel.DeliveryDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerDeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @KafkaListener(topics = {"delivery-topic"})
    public void consumeDeliveryDetails(DeliveryDetails deliveryDetails){
        deliveryRepository.save(deliveryDetails);
    }

    public List<DeliveryDetails> getDeliveryDetails(){
        return deliveryRepository.findAll();
    }
}
