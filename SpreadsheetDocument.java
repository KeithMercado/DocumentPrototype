public class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        this.spreadsheetName = spreadsheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    @Override
    public Document clone() {
        return new SpreadsheetDocument(spreadsheetName, rowCount, columnCount);
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
    }

    @Override
    public String getType() {
        return "Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount;
    }

    // Setters
    public void setSpreadsheetName(String spreadsheetName) { this.spreadsheetName = spreadsheetName; }
    public void setRowCount(int rowCount) { this.rowCount = rowCount; }
    public void setColumnCount(int columnCount) { this.columnCount = columnCount; }
}
