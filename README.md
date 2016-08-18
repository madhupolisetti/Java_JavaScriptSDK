#Java_SDK

run maven clean install

Jar file will be built under target.

SmsCountry.getInstance() by default loads with prod.properties which uses the production urls.

For test environments, write a file test.properties with the same format as prod.properties but with test server urls. Then use SmsCountry.getInstance("test.properties") to get the test instance.

#Javascript_SDK

Get an instance of SmsCountry with api key and token.

Each instance of SmsCountry will return an instance of SmsClient, GroupClient, CallsClient, GroupCallsClient.

An example of getting the SmsClient is in testSmsClient.js
