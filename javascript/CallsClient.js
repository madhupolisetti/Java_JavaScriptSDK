var CallsClient = function(authorization, apiKey){
    
    this.authorization = authorization;
    this.apiKey = apiKey;
    
}

CallsClient.prototype.createNewCall = function(body, callbackFunction){
    var request = getAjaxClient();
    request.open('POST', getParentUrl() + this.apiKey + '/Calls/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

CallsClient.prototype.createBulkCall = function(body, callbackFunction){
    var request = getAjaxClient();
    request.open('POST', getParentUrl() + this.apiKey + '/BulkCalls/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

CallsClient.prototype.getCallDetails = function(callUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/Calls/' + callUUID);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(null);
}

CallsClient.prototype.getCallsList = function(fromDate, toDate, senderId, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/Calls/(' + fromDate + ',' + toDate + ',' + senderId + ')');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(null);
}

CallsClient.prototype.playSound = function(callUUID, body, callbackFunction){
    var request = getAjaxClient();
    request.open('POST', getParentUrl() + this.apiKey + '/Calls/' + callUUID + '/Play');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

CallsClient.prototype.stopSound = function(callUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('DELETE', getParentUrl() + this.apiKey + '/Calls/' + callUUID + '/Play');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

CallsClient.prototype.startRecording = function(callUUID, body, callbackFunction){
    var request = getAjaxClient();
    request.open('POST', getParentUrl() + this.apiKey + '/Calls/' + callUUID + '/Recordings/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

CallsClient.prototype.stopRecording = function(callUUID, recordingUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/Calls/' + callUUID + '/Recordings/' + recordingUUID);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

CallsClient.prototype.getRecordingDetails = function(callUUID, recordingUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/Calls/' + callUUID + '/Recordings/' + recordingUUID);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

CallsClient.prototype.getAllRecordingDetails = function(callUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/Calls/' + callUUID + '/Recordings/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

CallsClient.prototype.disconnectCall = function(callUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/Calls/' + callUUID);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

CallsClient.prototype.disconnectMultiCalls = function( body, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/Calls/Hangup/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}