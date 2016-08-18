var GroupCallsClient = function(authorization, apiKey){
    
    this.authorization = authorization;
    this.apiKey = apiKey;
    
}

GroupCallsClient.prototype.createGroupCall = function(body, callbackFunction){
    var request = getAjaxClient();
    request.open('POST', getParentUrl() + this.apiKey + '/GroupCalls/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

GroupCallsClient.prototype.getGroupDetails = function(groupCallUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.getParticipantDetails = function(groupCallUUID, participantId, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Participants/' + participantId);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.getAllParticipants = function(groupCallUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Participants/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.playSoundIntoGroupCall = function(groupCallUUID,body, callbackFunction){
    var request = getAjaxClient();
    request.open('POST', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Play');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

GroupCallsClient.prototype.playSoundIntoParticipantInGroupCall = function(groupCallUUID, participantId, body, callbackFunction){
    var request = getAjaxClient();
    request.open('POST', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Participants/' + participantId + '/Play');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

GroupCallsClient.prototype.muteAllParticipantInGroupCall = function(groupCallUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Mute');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.muteParticipantInGroupCall = function(groupCallUUID, participantId, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID +'/Participants/' + participantId  + '/Mute');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.unmuteAllParticipantInGroupCall = function(groupCallUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/UnMute');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.unmuteParticipantInGroupCall = function(groupCallUUID, participantId, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID +'/Participants/' + participantId  + '/UnMute');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.startRecordingInGroupCall = function(groupCallUUID, body, callbackFunction){
    var request = getAjaxClient();
    request.open('POST', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Recordings/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

GroupCallsClient.prototype.stopRecordingInGroupCall = function(groupCallUUID, recordingId, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Recordings/' + recordingId);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.stopAllRecordingsInGroupCall = function(groupCallUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Recordings/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.getRecordingDetailsInGroup = function(groupCallUUID, recordingId, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Recordings/' + recordingId);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.getAllRecordingDetailsInGroup = function(groupCallUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Recordings/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.deleteRecordingDetailsInGroup = function(groupCallUUID, recordingId, callbackFunction){
    var request = getAjaxClient();
    request.open('DELETE', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Recordings/' + recordingId);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.deleteAllRecordingDetailsInGroup = function(groupCallUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('DELETE', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Recordings/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.disconnectAllParticipantsInGroup = function(groupCallUUID, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Hangup/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupCallsClient.prototype.disconnectParticipantInGroup = function(groupCallUUID, participantId, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/GroupCalls/' + groupCallUUID + '/Participants/'+ participantId +'/Hangup/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

