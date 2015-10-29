package com.amazon.payments.lpa.response.parser;

import com.amazon.payments.lpa.response.autogenerated.model.AuthorizationDetails;
import com.amazon.payments.lpa.response.autogenerated.model.AuthorizeResponse;
import com.amazon.payments.lpa.response.autogenerated.model.HttpResponseObject;

public class AuthorizeResponseData {
    
    private String rawXML;
    private String requestId;
    private AuthorizationDetails authorizationDetails;
    
    public AuthorizeResponseData(AuthorizeResponse authorizeResponse , HttpResponseObject rawResponse) {
        this.rawXML = rawResponse.getData();
        if(authorizeResponse != null) {
            if(authorizeResponse.getAuthorizeResult() != null) {
                this.authorizationDetails = authorizeResponse.getAuthorizeResult().getAuthorizationDetails();
            }
            this.requestId = authorizeResponse.getResponseMetadata().getRequestId();
        }
    }

    public String toXML() {
        return rawXML;
    }

    public String getRequestId() {
        return requestId;
    }

    public AuthorizationDetails getDetails() {
        return authorizationDetails;
    }

}