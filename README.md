# Global Giving API
The Global Giving API is a RESTful web API implemented in Java that uses Spring to provide an HTTP interface for retrieving messages from charities. It connects to a DynamoDB instance that holds all of the messages created from sms and mms messages.

The `master` branch shows the use of Spring, Angular, nginx, the [AWS SDK for Java](http://aws.amazon.com/sdkforjava), [Amazon DynamoDB](http://aws.amazon.com/dynamodb), Gradle, CORS, and [AWS Elastic Beanstalk](http://aws.amazon.com/elasticbeanstalk) features that enable you to:

- Run both components on the same [Amazon EC2](http://aws.amazon.com/ec2) instance.
- Create required DynamoDB and [Amazon SNS](http://aws.amazon.com/sns) resources as part of the Elastic Beanstalk environment.
- Build the API from source on instance during deployment.

