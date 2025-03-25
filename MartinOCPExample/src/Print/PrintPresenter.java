package Print;


import Controller.FinancialReportPresenter;
import Interactor.FinancialReportResponse;

public class PrintPresenter implements FinancialReportPresenter {

    private final PrintView view;

    public PrintPresenter(PrintView view) {
        this.view = view;
    }

    @Override
    public void create(FinancialReportResponse report) {
        var viewModel = new PrintViewModel();
        view.createView(viewModel);

    }
}

