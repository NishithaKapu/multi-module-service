package consumerController;

import consumerModel.DeliveryDetails;
import consumerService.ConsumerDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/delivery")
public class ConsumerDeliveryController {

    @Autowired
    private ConsumerDeliveryService consumerDeliveryService;

    @GetMapping("/getDeliveryList")
    public List<DeliveryDetails> getDeliveryList(){
        return consumerDeliveryService.getDeliveryDetails();
    }

}
