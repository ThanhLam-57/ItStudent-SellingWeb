package com.bksoftware.lambda;

public class Judgement {

    private final boolean clause;

    public static Judgement judgement(boolean clause) {
        return new Judgement(clause);
    }

    private Judgement(boolean clause) {
        this.clause = clause;
    }

    public Judgement right(MyExecutor executor) {
        if (clause)
            executor.execute();
        return this;
    }

    public Judgement wrong(MyExecutor executor) {
        if (!clause)
            executor.execute();
        return this;
    }
}
