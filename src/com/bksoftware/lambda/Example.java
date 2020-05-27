package com.bksoftware.lambda;

public class Example {
    public static void main(String[] args) {
//        MyList list = new MyList("A", "B", "C");
//        list.forEach(System.out::println);
        boolean ex = 1 == 1;
        Judgement.judgement(ex)
                .right(() -> System.out.println("OK"))
                .wrong(() -> System.out.println("Wrong"));
    }
}
