
package com.mycompany;


public class HelloMessage implements Message
{
    private String txt;

    public HelloMessage(String txt) {
        this.txt = "Hello"+txt;
    }

    @Override
    public String getText() {
        return txt;
    }
}
