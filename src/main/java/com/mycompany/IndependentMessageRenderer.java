
package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;


public class IndependentMessageRenderer {
    @Autowired
    private MessageRenderer rnd;
    public void print()
    {
        rnd.printMessage();
    }
}
