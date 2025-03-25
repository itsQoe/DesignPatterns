package Screen;


import Controller.FinancialReportPresenter;
import Interactor.FinancialReportResponse;

public class ScreenPresenter implements FinancialReportPresenter {

    private final ScreenView view;

    public ScreenPresenter(ScreenView view) {
        this.view = view;
    }

    @Override
    public void create(FinancialReportResponse report) {
        var viewModel = new ScreenViewModel();
        view.createView(viewModel);

    }
}

