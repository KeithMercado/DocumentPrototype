public class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    public TextDocument(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    @Override
    public Document clone() {
        return new TextDocument(filePath, encoding, wordCount);
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    @Override
    public String getType() {
        return "Text, Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount;
    }

    // Setters
    public void setFilePath(String filePath) { this.filePath = filePath; }
    public void setEncoding(String encoding) { this.encoding = encoding; }
    public void setWordCount(int wordCount) { this.wordCount = wordCount; }
}
