var GroupClient = function(authorization, apiKey){
    
    this.authorization = authorization;
    this.apiKey = apiKey;
    
}

GroupClient.prototype.createNewGroup = function(body, callbackFunction){
    var request = getAjaxClient();
    request.open('POST', getParentUrl() + this.apiKey + '/Groups/')
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

GroupClient.prototype.getGroupDetails = function(groupId, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/Groups/' + groupId);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupClient.prototype.getGroupCollection = function(nameLike,startGroupCallOnEnter, endGroupCallOnExit, tinyName, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/Groups/(' + nameLike + ',' + startGroupCallOnEnter + ',' + endGroupCallOnExit + ',' + tinyName + ')');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupClient.prototype.updateGroup = function(groupId, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/Groups/' + groupId);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

GroupClient.prototype.deleteGroup = function(groupId, callbackFunction){
    var request = getAjaxClient();
    request.open('DELETE', getParentUrl() + this.apiKey + '/Groups/' + groupId);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupClient.prototype.getMemberDetails = function(groupId,memberId, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/Groups/' + groupId + '/Members/' + memberId);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupClient.prototype.getAllGroupMembers = function(groupId, callbackFunction){
    var request = getAjaxClient();
    request.open('GET', getParentUrl() + this.apiKey + '/Groups/' + groupId + '/Members/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupClient.prototype.updateMemberDetails = function(groupId, memberId, callbackFunction){
    var request = getAjaxClient();
    request.open('PATCH', getParentUrl() + this.apiKey + '/Groups/' + groupId + '/Members/' + memberId);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}

GroupClient.prototype.deleteGroupMember = function(groupId, memberId, callbackFunction){
    var request = getAjaxClient();
    request.open('DELETE', getParentUrl() + this.apiKey + '/Groups/' + groupId + '/Members/' + memberId);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send();
}

GroupClient.prototype.addGroupMember = function(groupId, callbackFunction){
    var request = getAjaxClient();
    request.open('POST', getParentUrl() + this.apiKey + '/Groups/' + groupId + '/Members/');
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Authorization', 'Basic ' + this.authorization);
    
    request.onreadystatechange = function () {
        if(this.readyState === 4){
            callbackFunction(this.status, this.responseText);
        }
    }
    request.send(JSON.stringify(body));
}