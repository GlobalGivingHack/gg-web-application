package charity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rrv162 on 11/27/17.
 */
@RestController
@RequestMapping(value="/api/donorEvent")
public class DonorEventController {

    private final DonorEventFactory factory = new DonorEventFactory();

    /* GET /donorEvent */
    @RequestMapping(method=RequestMethod.GET)
    public List<DonorEvent> getDonorEvents() {
        return factory.getDonorEvents();
    }

}
