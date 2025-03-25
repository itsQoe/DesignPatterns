package Interactor;

public class FinancialReportGenerator implements FinancialReportRequester {
    public FinancialReportResponse getReport(FinancialReportRequest request) {
        return new FinancialReportResponse();
    }
}
