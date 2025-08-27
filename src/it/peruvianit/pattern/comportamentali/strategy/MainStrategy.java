package it.peruvianit.pattern.comportamentali.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        ContextDocument contextDocumentExcel = new ContextDocument();
        contextDocumentExcel.setSavingStrategy(new ConcreteExcelStrategy());
        contextDocumentExcel.saveStrategy("esempio-file.excel");

        ContextDocument contextDocumentPdf = new ContextDocument();
        contextDocumentPdf.setSavingStrategy(new ConcretePdfStrategy());
        contextDocumentPdf.saveStrategy("esempio-file-pdf");
    }
}
