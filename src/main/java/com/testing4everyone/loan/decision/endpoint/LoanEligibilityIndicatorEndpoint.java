package com.testing4everyone.loan.decision.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.testing4everyone.loan.decision.loaneligibility.Acknowledgement;
import com.testing4everyone.loan.decision.loaneligibility.CustomerRequest;
import com.testing4everyone.loan.decision.service.LoanEligibilityService;

public class LoanEligibilityIndicatorEndpoint {
    private static final String NAMESPACE = "http://testing4everyone.com/spring/soap/api/loanEligibility";
    @Autowired
    private LoanEligibilityService service;

    @PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
    @ResponsePayload
    public Acknowledgement getLoanStatus(@RequestPayload CustomerRequest request) {
        return service.checkLoanEligibility(request);
    }

}
