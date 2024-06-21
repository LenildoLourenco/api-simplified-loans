package api.simplified.loans.controller;

import api.simplified.loans.dto.CustomerLoanRequest;
import api.simplified.loans.dto.CustomerLoanResponse;
import api.simplified.loans.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping(value = "/customer-loans")
    public ResponseEntity<CustomerLoanResponse> customerLoans(@RequestBody CustomerLoanRequest loanRequest) {
      var loanResponse = loanService.checkLoanAvailability(loanRequest);

      return ResponseEntity.ok(loanResponse);
    }
}
