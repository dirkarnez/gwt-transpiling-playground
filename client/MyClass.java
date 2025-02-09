package client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/*
JsInterop 

new client.MyClass("aa").sayHello()
*/
@JsType
public class MyClass {

  public String name;

  public MyClass(String name) {
    this.name = name;
  }

  public String sayHello() {
    return "Hello " + this.name;
  }
}