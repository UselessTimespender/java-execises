package document_viewer;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {

    @Test
    void getContent() {
        var document1 = new Document("document1", Lists.charactersOf("content"));
    }
}