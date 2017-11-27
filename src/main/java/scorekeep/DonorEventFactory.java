package scorekeep;

import java.util.List;

/**
 * Created by rrv162 on 11/27/17.
 */
public class DonorEventFactory {

    private final DonorEventModel model = new DonorEventModel();

    public DonorEventFactory(){
    }

    public List<DonorEvent> getDonorEvents() {
        return model.loadDonorEvents();
    }
}
