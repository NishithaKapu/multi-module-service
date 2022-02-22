package producerController;

import model.DeliveryDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import producerService.ProducerDeliveryService;

@RestController
@RequestMapping("/publishapi")
public class DeliveryController {

    @Autowired
    ProducerDeliveryService deliveryService;

    @PostMapping("/sendDeliveryData")
    public void sendDeliveryData(@RequestBody DeliveryDetails deliveryDetails){
        deliveryService.sendDeliveryDetails(deliveryDetails);

    }
}
