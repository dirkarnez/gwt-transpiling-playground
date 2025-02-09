package client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/*
JsInterop 
https://docs.google.com/document/d/10fmlEYIHcyead_4R1S5wKGs1t2I7Fnp_PaNaa7XTEk0/edit?pli=1&tab=t.0

new client.MathLogic().add(1, 5);
*/
@JsType
public class MathLogic {
    public int add(int a, int b) {
        return a + b;
    }
}