package grigorev.data;

public interface Mediator {
    void notify(Widget widget, String event);
}
