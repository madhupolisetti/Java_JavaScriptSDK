#Java_SDK

run maven clean install

Jar file will be built under target.

SmsCountry.getInstance() by default loads with prod.properties which uses the production urls.

For test environments, write a file test.properties with the same format as prod.properties but with test server urls. Then use SmsCountry.getInstance("test.properties") to get the test instance.
