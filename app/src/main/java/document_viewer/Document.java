package document_viewer;

import java.util.List;

public class Document {
    private String name;
    private List<Character> content;

    public Document(String name, List<Character> content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Character> getContent() {
        return content;
    }

    public void setContent(List<Character> content) {
        this.content = content;
    }
}
