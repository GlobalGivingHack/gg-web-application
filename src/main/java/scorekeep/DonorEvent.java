package scorekeep;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * Created by rrv162 on 11/27/17.
 */

@DynamoDBTable( tableName = TableNames.DONOR_EVENT_TABLE )
public class DonorEvent {

    private String message_id;
    private String charity_id;
    private String user_id;
    private String message;
    private String media_url;

    public DonorEvent() {
    }

    public DonorEvent(String message_id) {
        this.message_id = message_id;
    }

    @DynamoDBHashKey(attributeName="message_id")
    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    @DynamoDBHashKey(attributeName="charity_id")
    public String getCharity_id() {
        return charity_id;
    }

    public void setCharity_id(String charity_id) {
        this.charity_id = charity_id;
    }

    @DynamoDBHashKey(attributeName="user_id")
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @DynamoDBHashKey(attributeName="message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @DynamoDBHashKey(attributeName="media_url")
    public String getMedia_url() {
        return media_url;
    }

    public void setMedia_url(String media_url) {
        this.media_url = media_url;
    }

}
