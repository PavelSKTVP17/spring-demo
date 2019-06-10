package com.mycompany;


public class MessageRendererErrorImp  implements  MessageRenderer
{
    private Message msg;

    public MessageRendererErrorImp(Message msg) {
        this.msg = msg;
    }

    @Override
    public void printMessage() {
        System.out.println( msg.getText() );
    }
    
}
