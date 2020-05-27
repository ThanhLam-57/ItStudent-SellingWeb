package com.bksoftware.lambda;

public class MyList {
    private String[] data;

    public MyList(String ...data){
        this.data = data;
    }

    public void forEach(MyJob newJob){
        for (String member : data){
            newJob.doJob(member);
        }
    }

    public String[] getData() {
        return data;
    }

    public MyList setData(String[] data) {
        this.data = data;
        return this;
    }
}
