package client;

import client.CounterEvent;
import com.google.gwt.event.shared.EventHandler;

public interface CounterEventHandler extends EventHandler {
  void onCountChanged(CounterEvent event);
}