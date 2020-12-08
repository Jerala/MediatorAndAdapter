package grigorev;

import grigorev.data.MediatorWidget;
import grigorev.service.WidgetManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        WidgetManager widgetManager = new WidgetManager();
        MediatorWidget mediator = widgetManager.configure();
        Path path = Paths.get("").toAbsolutePath().resolve(Paths.get("src\\main\\java\\grigorev\\employee1.xml"));
        mediator.getXmlReaderWidget().inputFile(path);
    }
}
