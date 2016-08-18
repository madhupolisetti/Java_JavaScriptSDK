var smsCountry = new SmsCountry('7nZIXc5752aUeST8WATv','UAbIyRUIdwB7wDzu6gdCAe4SwSXFbzDBL2fOBA4N');

var smsClient = smsCountry.smsClient;
var body = {
  'Text': 'Sample text',
  'Number': '91XXXXXXXXXX',
  'SenderId': 'SMSCountry',
  'DRNotifyUrl': 'https://www.domainname.com/notifyurl',
  'DRNotifyHttpMethod': 'POST'
};

function handleResponse(status, response){
    alert(status + ' ' + response);
}
var response = smsClient.getSmsDetails('4236749c-0d5c-4b1e-9598-3260e688d616', handleResponse);