package com.mycompany;

public class MessageRendererStandartImp implements  MessageRenderer
{
    private Message msg;

    public MessageRendererStandartImp(Message msg) {
        this.msg = msg;
    }

    @Override
    public void printMessage() {
        System.out.println( msg.getText() );
    }
    
}
