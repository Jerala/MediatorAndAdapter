package grigorev.data;

public class LabelWidget implements Widget {

    private Mediator mediator;

    public LabelWidget(Mediator mediator) {
        this.mediator = mediator;
    }

    public void display(String text) {
        System.out.println("Label widget displays text: " + text);
    }

}
