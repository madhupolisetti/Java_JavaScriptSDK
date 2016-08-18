var SmsClient = function(authorization, apiKey){
    
    this.authorization = authorization;
    this.apiKey = apiKey;
    
}

SmsClient.prototype.sendSms = function(body, callbackFunction){
    var request = getAjaxClient();
    request.open('POST', getParentUrl() + this.apiKey + '/SMSes/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

SmsClient.prototype.getSmsDetails = function(msgUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/SMSes/' + msgUUID);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(null);
}

SmsClient.prototype.getSmsCollections = function(fromDate,toDate,senderId, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/SMSes/(' + fromDate + ',' + toDate + ',' + senderId + ')');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(null);
}

SmsClient.prototype.sendBulkSms = function(body, callbackFunction){
    var request = getAjaxClient();
    request.open('POST', getParentUrl() + this.apiKey + '/BulkSMSes/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

