package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import client.MathLogic;
import client.CounterEvent;

// com.google.gwt.event.shared.EventBus
public class MyEntryPoint implements EntryPoint {
  private int count = 123;

  private EventBus eventBus = new SimpleEventBus();

  public void onModuleLoad() {
    // Button b = new Button("Click me", new ClickHandler() {
    //   public void onClick(ClickEvent event) {
    //     MathLogic logic = new MathLogic();
    //     int result = logic.add(5, 11);
    //     Window.alert("Hello, AJAX " + result);
    //   }
    // });

    // RootPanel.get().add(b);
    eventBus.fireEvent(new CounterEvent(count));
  }
}


