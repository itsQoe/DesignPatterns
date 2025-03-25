import Controller.FinancialReportController;
import Interactor.FinancialReportGenerator;
import Print.PDFView;
import Print.PrintPresenter;
import Screen.ScreenPresenter;
import Screen.WebView;

public class Main {
    public static void main(String[] args) {
        var reportRequester = new FinancialReportGenerator();

        // Create Web Report
        var webView = new WebView();
        var webPresenter = new ScreenPresenter(webView);
        var webReportController = new FinancialReportController(reportRequester, webPresenter);
        webReportController.createReport();

        // Create PDF Report
        var pdfView = new PDFView();
        var pdfPresenter = new PrintPresenter(pdfView);
        var pdfReportController = new FinancialReportController(reportRequester, pdfPresenter);
        pdfReportController.createReport();

    }
}