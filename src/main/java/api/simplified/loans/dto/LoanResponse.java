package api.simplified.loans.dto;

import api.simplified.loans.domain.LoanType;

public record LoanResponse(LoanType type, Double interestRate) {
}
