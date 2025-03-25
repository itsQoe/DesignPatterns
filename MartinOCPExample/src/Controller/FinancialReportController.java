package Controller;

import Interactor.FinancialReportRequest;
import Interactor.FinancialReportRequester;

public class FinancialReportController {
    private final FinancialReportPresenter presenter;
    private final FinancialReportRequester reportRequester;

    public FinancialReportController(FinancialReportRequester reportRequester, FinancialReportPresenter presenter) {
        this.presenter = presenter;
        this.reportRequester = reportRequester;
    }


    public void createReport() {
        var request = new FinancialReportRequest();
        var response = reportRequester.getReport(request);
        presenter.create(response);
    }
}
