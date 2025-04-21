public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public PdfDocument createPdfDocument(String fileName, String author, int pages) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.setFileName(fileName);
        doc.setAuthor(author);
        doc.setPageCount(pages);
        return doc;
    }

    public TextDocument createTextDocument(String filePath, String encoding, int words) {
        TextDocument doc = (TextDocument) textDocumentPrototype.clone();
        doc.setFilePath(filePath);
        doc.setEncoding(encoding);
        doc.setWordCount(words);
        return doc;
    }

    public SpreadsheetDocument createSpreadsheetDocument(String name, int rows, int columns) {
        SpreadsheetDocument doc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        doc.setSpreadsheetName(name);
        doc.setRowCount(rows);
        doc.setColumnCount(columns);
        return doc;
    }
}
