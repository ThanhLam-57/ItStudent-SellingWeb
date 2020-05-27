package com.bksoftware.lambda;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Example {
    public static void main(String[] args) {
       boolean boo = 1 != 1;

       Judgement.judgement(boo)
               .right(() -> System.out.println("Right"))
               .wrong(() -> System.out.println("Wrong"));

    }
}
