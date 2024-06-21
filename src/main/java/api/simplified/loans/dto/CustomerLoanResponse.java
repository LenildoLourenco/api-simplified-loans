package api.simplified.loans.dto;

import java.util.List;

public record CustomerLoanResponse(String customer, List<LoanResponse> Loans) {
}
