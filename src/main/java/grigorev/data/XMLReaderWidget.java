package grigorev.data;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class XMLReaderWidget implements Widget {

    private String fileContent;
    private Mediator mediator;

    public XMLReaderWidget(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void inputFile(Path filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try {
            List<String> content = Files.readAllLines(filePath);
            for (String elem: content) {
                contentBuilder.append(elem);
            }
        }  catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        fileContent = contentBuilder.toString();
        mediator.notify(this, "input");
    }

}
