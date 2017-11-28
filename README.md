# Global Giving API
The Global Giving API is a RESTful web API implemented in Java that uses Spring to provide an HTTP interface for retrieving messages from charities. It connects to a DynamoDB instance that holds all of the messages created from sms and mms messages.

This happens to be written in Java and Spring, but that's just because that was the quickest sample application I could get running using Elastic Beanstalk. If I had just a bit more time or to do over, this could just as well be a lambda or maybe an EC2 in Node. But, regardless this isn't doing anything amazing. It's just meant to serve up the charity messages found in the DynamoDB.
