package grigorev.data;

import grigorev.service.DbAdapter;

public class MediatorWidget implements Mediator {

    private XMLReaderWidget xmlReaderWidget;
    private LabelWidget labelWidget;
    private DbAdapter dbAdapter = new DbAdapter();

    public XMLReaderWidget getXmlReaderWidget() {
        return xmlReaderWidget;
    }

    public void setXmlReaderWidget(XMLReaderWidget xmlReaderWidget) {
        this.xmlReaderWidget = xmlReaderWidget;
    }

    public LabelWidget getLabelWidget() {
        return labelWidget;
    }

    public void setLabelWidget(LabelWidget labelWidget) {
        this.labelWidget = labelWidget;
    }

    public void notify(Widget sender, String event) {
        if (sender == xmlReaderWidget && event.equals("input")) {
            boolean isSuccess = dbAdapter.insertXMLToMongoDB(xmlReaderWidget.getFileContent());
            labelWidget.display(isSuccess ? "Inserted!" : "Failed :(");
        }
    }

}
