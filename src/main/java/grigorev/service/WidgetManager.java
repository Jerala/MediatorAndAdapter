package grigorev.service;

import grigorev.data.LabelWidget;
import grigorev.data.MediatorWidget;
import grigorev.data.XMLReaderWidget;

public class WidgetManager {

    public MediatorWidget configure() {
        MediatorWidget mediatorWidget = new MediatorWidget();
        XMLReaderWidget xmlReaderWidget = new XMLReaderWidget(mediatorWidget);
        LabelWidget labelWidget = new LabelWidget(mediatorWidget);
        mediatorWidget.setLabelWidget(labelWidget);
        mediatorWidget.setXmlReaderWidget(xmlReaderWidget);

        return mediatorWidget;
    }

}
