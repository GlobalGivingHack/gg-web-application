package scorekeep;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by rrv162 on 11/27/17.
 */
public class DonorEventController {

    private final DonorEventFactory factory = new DonorEventFactory();
    private final DonorEventModel model = new DonorEventModel();

    /* GET /user */
    @RequestMapping(method=RequestMethod.GET)
    public List<DonorEvent> getDonorEvents() {
        return factory.getDonorEvents();
    }

}
