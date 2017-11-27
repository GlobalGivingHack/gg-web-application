package scorekeep;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * Created by rrv162 on 11/27/17.
 */

@DynamoDBTable( tableName = TableNames.DONOR_EVENT_TABLE )
public class DonorEvent {

    private String event_id;
    private String charity_id;
    private String donor_email;
    private String message;

    public DonorEvent() {
    }

    public DonorEvent(String event_id) {
        this.event_id = event_id;
    }

    @DynamoDBHashKey(attributeName="event_id")
    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    @DynamoDBHashKey(attributeName="charity_id")
    public String getCharity_id() {
        return charity_id;
    }

    public void setCharity_id(String charity_id) {
        this.charity_id = charity_id;
    }

    @DynamoDBHashKey(attributeName="donor_email")
    public String getDonor_email() {
        return donor_email;
    }

    public void setDonor_email(String donor_email) {
        this.donor_email = donor_email;
    }

    @DynamoDBHashKey(attributeName="message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
