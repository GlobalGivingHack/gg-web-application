package scorekeep;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;

import java.util.List;

/**
 * Created by rrv162 on 11/27/17.
 */
public class DonorEventModel {

    /** AWS SDK credentials. */
    private AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
            .build();
    private DynamoDBMapper mapper = new DynamoDBMapper(client);

    public List<DonorEvent> loadDonorEvents(){
        DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
        List<DonorEvent> scanResult = mapper.scan(DonorEvent.class, scanExpression);
        return scanResult;
    }

}
