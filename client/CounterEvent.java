package client;

import client.CounterEventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class CounterEvent extends GwtEvent<CounterEventHandler> {
  public static Type<CounterEventHandler> TYPE = new Type<CounterEventHandler>();
  private final int count;

  public CounterEvent(int count) {
    this.count = count;
  }

  public int getCount() {
    return count;
  }

  @Override
  public Type<CounterEventHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(CounterEventHandler handler) {
    handler.onCountChanged(this);
  }
}